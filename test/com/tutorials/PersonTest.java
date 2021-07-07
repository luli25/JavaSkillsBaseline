package com.tutorials;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void shouldCreateAPersonObject() {

        Person p = new Person("Cosme", "Fulanito", 32, 180, 85, "Male");

        Logger logger = Logger.getLogger(Person.class.getName());
        logger.info("Created object named: " + p.getFullName());

        assertEquals("Cosme", p.getFirstName());
        assertEquals("Fulanito", p.getLastName());
        assertEquals(32, p.getAge());
        assertEquals(180, p.getHeight());
        assertEquals(85, p.getWeight());
        assertEquals("Male", p.getGender());
        assertEquals("Cosme Fulanito", p.getFullName());
    }
}