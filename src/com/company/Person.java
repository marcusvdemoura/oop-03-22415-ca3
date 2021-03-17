package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person(String name, String lastName, String emailAddress) {
        this.firstName = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
