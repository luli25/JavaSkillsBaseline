package com.tutorials;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testPrintAuditMethod() {
        Logger logger = Logger.getLogger(EmployeeTest.class.getName());

        Employee employee = new Employee("Jose", "Argento", 46, 175, 68, "Male");
        employee.setSalary(BigDecimal.valueOf(85000L));
        employee.setEmployeeNumber("0485");
        employee.setTaxpayerIdNumber("048-45-6789");

        employee.printAudit(logger);
    }

    //Comparing objects with "=="
    @Test
    public void compareTwoObjects() {
        int num1 = 1;
        int num2 = 1;
        Logger l = Logger.getLogger(EmployeeTest.class.getName());

        l.info("Q: int1 == int2?           A: " + (num1 == num2));
        Integer integer1 = Integer.valueOf(num1);
        Integer integer2 = Integer.valueOf(num2);
        l.info("Q: Integer1 == Integer2?   A: " + (integer1 == integer2));
        integer1 = Integer.valueOf(num1);
        integer2 = Integer.valueOf(num2);
        l.info("Q: Integer1 == Integer2?   A: " + (integer1 == integer2));
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        l.info("Q: Employee1 == Employee2? A: " + (employee1 == employee2));
    }

    //Comparing objects with equals()
    @Test
    public void compareTwoObjectsAgain() {
        Logger l = Logger.getLogger(Employee.class.getName());
        Integer integer1 = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf(1);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        integer1 = Integer.valueOf(integer1);
        integer2 = Integer.valueOf(integer2);
        l.info("Q: integer1 == integer2 ? A: " + (integer1 == integer2));
        l.info("Q: integer1.equals(integer2) ? A: " + integer1.equals(integer2));
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        l.info("Q: employee1 == employee2 ? A: " + (employee1 == employee2));
        l.info("Q: employee1.equals(employee2) ? A : " + employee1.equals(employee2));
    }

    @Test
    //Exceptions handling
    public void exceptionsTesting() {
        Logger logger = Logger.getLogger(Employee.class.getName());
        //Employee employee1 = new Employee();
        try {
            Employee employee1 = null;
            employee1.setFirstName("Cosme");
            Employee employee2 = new Employee();
            employee2.setFirstName("Cosme");
            logger.info("Q: employee1 == employee2?      A: " + (employee1 == employee2));
            logger.info("Q: employee1.equals(employee2)? A: " + employee1.equals(employee2));
        } catch (Exception e) {
            logger.severe("Caught exception: " + e.getMessage());
        }

    }
}