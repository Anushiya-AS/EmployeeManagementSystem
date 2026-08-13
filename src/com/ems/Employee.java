package com.ems;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private String designation;
    private double salary;
    private String email;

    public Employee() {
    }

    public Employee(int empId, String empName, String department,
                    String designation, double salary, String email) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}