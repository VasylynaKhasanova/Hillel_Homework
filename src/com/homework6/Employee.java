package com.homework6;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private int hourPayment;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHourPayment() {
        return hourPayment;
    }

    public void setHourPayment(int hourPayment) {
        this.hourPayment = hourPayment;
    }

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Employee(String lastName, String firstName, String position, int hourPayment) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.hourPayment = hourPayment;
    }

}

