package com.tutorials;

import java.util.Objects;
import java.util.logging.Logger;

public class Person {
    Logger logger = Logger.getLogger(Person.class.getName());

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private String gender;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age, int height, int weight, String gender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return getFirstName().concat(" ").concat(getLastName());
    }

    /* Overloaded method example */
    public void printAudit(StringBuilder buffer) {
        buffer.append(toString());
    }

    public void printAudit(Logger logger1) {
        StringBuilder sb = new StringBuilder();
        printAudit(sb);
        logger1.info(sb.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
