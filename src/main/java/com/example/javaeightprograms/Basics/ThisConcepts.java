package com.example.javaeightprograms.Basics;

import java.io.Serializable;

public class ThisConcepts {
    public static void main(String[] args) {

    }


}

class BankAccount implements Serializable
{
    private String accountNumber;
    private String accountHolderName;
    private volatile double balance;

    private String password;

    private String bankCode;

    private String bankBranch;

    public BankAccount(String accountHolderName,String accountNumber)
    {
        this("SBIHYD", "SBI007", 25000.00);

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String bankCode, String bankBranch,double balance)
    {
        this.bankCode = bankCode;
        this.bankBranch = bankBranch;
        this.balance = balance;
    }
}
