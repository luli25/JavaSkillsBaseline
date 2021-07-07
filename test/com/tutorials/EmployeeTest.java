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

}