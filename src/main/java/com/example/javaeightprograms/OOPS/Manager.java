package com.example.javaeightprograms.OOPS;

public class Manager {

    public static void main(String[] args) {

        FinancialDepartmentEmployee statement = new FinancialDepartmentEmployee("Banking","Home Lones", "India", "APAC");


        BankEmployee bankManager = new BankEmployee(1,"Akshay", "chaganthi", "Accounts");

        BankEmployee assistManager = new BankEmployee(2,"sonia","chow", "Accounts" );

        BankEmployee headManager = new BankEmployee(3, "abhilash", "Chowdary", "Bank Manager");

        statement.entryCodeEmployee();

        System.out.println(statement);

        System.out.println(bankManager);
        System.out.println(assistManager);
        System.out.println(headManager);


        statement.saveDepartment();




    }
}
