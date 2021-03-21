package com.company;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;

    private String regex = "^[a-z0-9+_.-]+@(.+)$";

    public Person(String name, String lastName, String emailAddress) {
        this.firstName = name;
        this.lastName = lastName;
        if (emailAddress.matches(regex)) {
            this.emailAddress = emailAddress;
        } else {
            this.emailAddress = "E-MAIL ADDRESS INPUT WAS INVALID!";
        }

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
