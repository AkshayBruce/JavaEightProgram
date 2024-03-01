package com.example.javaeightprograms.OOPS;

import java.util.Objects;

public class BankEmployee extends FinancialDepartmentEmployee{

    private Integer employee_ID;

    private String employee_FirstName;

    private String employee_lastName;

    private String employee_Department;

    private String employee_DOB;

    private String employee_ParentName;

    private String marital_status;

    private String gender;

    private String ssn;
    private String employee_Address;

    BankEmployee()
    {

    }
    BankEmployee(Integer employee_ID, String employee_FirstName, String employee_lastName, String employee_Department)
    {
       super();
        //super.entryCodeEmployee();
        this.employee_ID = employee_ID;
        this.employee_FirstName = employee_FirstName;
        this.employee_lastName = employee_lastName;
        this.employee_Department = employee_Department;
    }

    public BankEmployee(Integer employee_ID, String employee_FirstName, String employee_lastName, String employee_Department, String employee_DOB, String employee_ParentName, String marital_status, String gender, String ssn, String employee_Address) {
        this.employee_ID = employee_ID;
        this.employee_FirstName = employee_FirstName;
        this.employee_lastName = employee_lastName;
        this.employee_Department = employee_Department;
        this.employee_DOB = employee_DOB;
        this.employee_ParentName = employee_ParentName;
        this.marital_status = marital_status;
        this.gender = gender;
        this.ssn = ssn;
        this.employee_Address = employee_Address;
    }

    public Integer getEmployee_ID() {
        return employee_ID;
    }

    public String getEmployee_FirstName() {
        return employee_FirstName;
    }

    public String getEmployee_lastName() {
        return employee_lastName;
    }

    public String getEmployee_Department() {
        return employee_Department;
    }

    public void setEmployee_ID(Integer employee_ID) {
        this.employee_ID = employee_ID;
    }

    public void setEmployee_FirstName(String employee_FirstName) {
        this.employee_FirstName = employee_FirstName;
    }

    public void setEmployee_lastName(String employee_lastName) {
        this.employee_lastName = employee_lastName;
    }

    public void setEmployee_Department(String employee_Department) {
        this.employee_Department = employee_Department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankEmployee employee)) return false;
        return Objects.equals(employee_ID, employee.employee_ID) && Objects.equals(employee_FirstName, employee.employee_FirstName) && Objects.equals(employee_lastName, employee.employee_lastName) && Objects.equals(employee_Department, employee.employee_Department) && Objects.equals(employee_DOB, employee.employee_DOB) && Objects.equals(employee_ParentName, employee.employee_ParentName) && Objects.equals(marital_status, employee.marital_status) && Objects.equals(gender, employee.gender) && Objects.equals(ssn, employee.ssn) && Objects.equals(employee_Address, employee.employee_Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_ID, employee_FirstName, employee_lastName, employee_Department, employee_DOB, employee_ParentName, marital_status, gender, ssn, employee_Address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_ID=" + employee_ID +
                ", employee_FirstName='" + employee_FirstName + '\'' +
                ", employee_lastName='" + employee_lastName + '\'' +
                ", employee_Department='" + employee_Department + '\'' +
                ", employee_DOB='" + employee_DOB + '\'' +
                ", employee_ParentName='" + employee_ParentName + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", gender='" + gender + '\'' +
                ", ssn='" + ssn + '\'' +
                ", employee_Address='" + employee_Address + '\'' +
                '}';
    }


//    @Override
//    public String toString()
//    {
//        return  employee_FirstName +" "+
//                employee_lastName +" "+
//                employee_ID+ " "+
//                employee_Department;
//
//    }


}
