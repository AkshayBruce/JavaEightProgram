package com.example.javaeightprograms.Threads;

import java.io.Serializable;

public class TransientVolatileThread  {

    public static void main(String[] args) {
        TVTest t = new TVTest("Akshay",150000.00, 0.25);

        double totalTaxes = t.calculateTax();
        System.out.println("Thread : "+ totalTaxes);
        System.out.println("Johns income: "+ t.getIncome());
        System.out.println("Current tax rate: "+ t.getTaxRate());
        System.out.println("Get User id:" + t.getUserId());

        Thread thread = new Thread( ()->{
            t.setIncome(70000.00);
            System.out.println("Tax owed by Thread 1:" + t.calculateTax());
        });

        Thread thread2 = new Thread( ()->{
            t.setIncome(80000.00);
            System.out.println("Tax owed by Thread 2:" + t.calculateTax());
        });


        thread.start();
        thread2.start();
    }
}

class TVTest implements Serializable
{

    transient private String userId;
    volatile private double income;
    private final double taxRate;

    public TVTest(String userId, double income, double taxRate){
        this.userId = userId;
        this.income = income;
        this.taxRate = taxRate;
    }

    public double calculateTax(){
        return income * taxRate;
    }

    public double getIncome(){
        return income;
    }

    public void setIncome(double income){
        this.income = income;
    }

    public String getUserId(){
        return userId;
    }

    public double getTaxRate(){
        return taxRate;
    }

    @Override
    public String toString(){
        return "User id: " + userId + ", income: " + income + ", tax rate: "+
                taxRate;
}
}
