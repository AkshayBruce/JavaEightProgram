package com.example.javaeightprograms.StreamsAPI;

import java.util.List;

public class Employee {

     private String firstName;
    private String lastName;
    private Double Salary;

    private List<String> projects;


    public Employee(String firstName, String lastName, Double salary, List<String> projects) {

        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Salary=" + Salary +
                ", projects=" + projects +
                '}';
    }
}
