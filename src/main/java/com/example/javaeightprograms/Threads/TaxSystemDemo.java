package com.example.javaeightprograms.Threads;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

class TaxReturn implements Serializable {
    private static final long serialVersionUID = 1L;

    // Persistent fields
    private String taxpayerId;
    private int taxYear;
    private BigDecimal grossIncome;
    private BigDecimal taxableIncome;

    // Transient fields - recalculated values that shouldn't be serialized
    private transient BigDecimal calculatedTax;
    private transient Map<String, BigDecimal> deductionWorksheet;

    // Volatile fields - accessed by multiple threads
    private volatile TaxStatus status;
    private volatile long lastModificationTime;

    public enum TaxStatus {
        DRAFT, PROCESSING, COMPLETED, ERROR
    }

    public TaxReturn(String taxpayerId, int taxYear, BigDecimal grossIncome) {
        this.taxpayerId = taxpayerId;
        this.taxYear = taxYear;
        this.grossIncome = grossIncome;
        this.status = TaxStatus.DRAFT;
        this.deductionWorksheet = new HashMap<>();
        this.lastModificationTime = System.currentTimeMillis();
        initializeDeductions();
    }

    private void initializeDeductions() {
        deductionWorksheet = new HashMap<>();
        deductionWorksheet.put("standardDeduction", new BigDecimal("12950")); // 2022 standard deduction
        deductionWorksheet.put("personalExemption", BigDecimal.ZERO);
        deductionWorksheet.put("itemizedDeductions", BigDecimal.ZERO);
    }

    // Thread-safe tax calculation
    public void calculateTax() {
        status = TaxStatus.PROCESSING;

        try {
            // Calculate taxable income
            BigDecimal totalDeductions = deductionWorksheet.values()
                    .stream()
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            taxableIncome = grossIncome.subtract(totalDeductions)
                    .max(BigDecimal.ZERO);

            // Simple tax calculation (for demonstration)
            calculatedTax = calculateProgressiveTax(taxableIncome);

            status = TaxStatus.COMPLETED;
            lastModificationTime = System.currentTimeMillis();

        } catch (Exception e) {
            status = TaxStatus.ERROR;
            throw new RuntimeException("Error calculating tax", e);
        }
    }

    private BigDecimal calculateProgressiveTax(BigDecimal taxableIncome) {
        // 2022 tax brackets (simplified for demonstration)
        if (taxableIncome.compareTo(BigDecimal.valueOf(10000)) <= 0) {
            return taxableIncome.multiply(BigDecimal.valueOf(0.10));
        } else if (taxableIncome.compareTo(BigDecimal.valueOf(40000)) <= 0) {
            return taxableIncome.multiply(BigDecimal.valueOf(0.12));
        } else {
            return taxableIncome.multiply(BigDecimal.valueOf(0.22));
        }
    }

    // Thread-safe status check
    public TaxStatus getStatus() {
        return status;
    }

    public BigDecimal getCalculatedTax() {
        if (status != TaxStatus.COMPLETED) {
            throw new IllegalStateException("Tax calculation not completed");
        }
        return calculatedTax;
    }

    // Method to demonstrate serialization effects
    public void displayTaxInfo() {
        System.out.println("Tax Return Information:");
        System.out.println("Taxpayer ID: " + taxpayerId);
        System.out.println("Tax Year: " + taxYear);
        System.out.println("Gross Income: $" + grossIncome);
        System.out.println("Status: " + status);
        System.out.println("Calculated Tax: $" +
                (calculatedTax != null ? calculatedTax : "Not calculated"));
        System.out.println("Deduction worksheets: "+ deductionWorksheet);
        System.out.println("Last Modified: " + new Date(lastModificationTime));
    }
}

class TaxProcessor {
    private volatile boolean processing = false;

    public void processBatchReturns(List<TaxReturn> returns) {
        processing = true;

        // Simulate parallel processing of tax returns
        returns.parallelStream().forEach(taxReturn -> {
            try {
                taxReturn.calculateTax();
                Thread.sleep(1000); // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        processing = false;
    }

    public boolean isProcessing() {
        return processing;
    }
}

public class TaxSystemDemo {
    public static void main(String[] args) {
        // Create sample tax returns
        List<TaxReturn> returns = Arrays.asList(
                new TaxReturn("T123", 2022, new BigDecimal("50000")),
                new TaxReturn("T456", 2022, new BigDecimal("75000")),
                new TaxReturn("T789", 2022, new BigDecimal("100000"))
        );

        // Process returns
        TaxProcessor processor = new TaxProcessor();

        // Start monitoring thread
        Thread monitor = new Thread(() -> {
            while (processor.isProcessing()) {
                System.out.println("Processing tax returns...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        // Demonstrate serialization
        try {
            // Process and serialize
            processor.processBatchReturns(returns);

            // Serialize first return
            FileOutputStream fileOut = new FileOutputStream("taxreturn.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(returns.get(0));
            out.close();
            fileOut.close();

            // Deserialize
            FileInputStream fileIn = new FileInputStream("taxreturn.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TaxReturn deserializedReturn = (TaxReturn) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\nOriginal Tax Return:");
            returns.get(0).displayTaxInfo();

            System.out.println("\nDeserialized Tax Return:");
            deserializedReturn.displayTaxInfo();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}