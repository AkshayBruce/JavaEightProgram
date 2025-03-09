package com.example.javaeightprograms.OOPS;

public class FinancialDepartmentEmployee implements Employee,Department {

    String Department ;
    String Services;
    String Country;
    String Region;

    private DepartmentCode departmentCode;

    FinancialDepartmentEmployee()
    {

    }

    public FinancialDepartmentEmployee(String department, String services, String country, String region) {
        Department = department;
        Services = services;
        Country = country;
        Region = region;
    }

    public void entryCodeEmployee()
    {
        System.out.println("Statement for employee's serving for financial services...");
    }

    @Override
    public String toString()
    {
        return  Department +" "+
        Services+" "+
                Country +" "+
                Region;
    }

    @Override
    public void saveEmployeeDetails() {

        System.out.println("Write code to implement save employee details in further extensions..");
    }

    @Override
    public void saveDepartment() {

        System.out.println("Details of Department & Code:" +departmentCode);;
    }
}
