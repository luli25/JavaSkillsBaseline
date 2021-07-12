package com.tutorials;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Emiliano");
        employee.setLastName("Soto");
        employee.setAge(30);
        employee.setHeight(185);
        employee.setWeight(95);
        employee.setGender("Male");
        employee.setEmployeeNumber("0001");
        employee.setTaxpayerIdNumber("123-45-8769");
        employee.setSalary(BigDecimal.valueOf(90000L));
        employee.printAudit(log);
    }
}
