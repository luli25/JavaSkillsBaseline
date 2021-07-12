package com.tutorials;

import java.math.BigDecimal;

public class Employee extends Person{

    private String taxpayerIdNumber;
    private String employeeNumber;
    private BigDecimal salary;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, int age, int height, int weight, String gender) {
        super(firstName, lastName, age, height, weight, gender);
    }

    public String getTaxpayerIdNumber() {
        return taxpayerIdNumber;
    }

    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    // Overriding person's printAudit() method in employee
    @Override
    public void printAudit(StringBuilder buffer) {
        //Adding this line, the method will print the employee unique attributes, and the attributes of its parent class
        super.printAudit(buffer);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "taxpayerIdNumber='" + taxpayerIdNumber + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
