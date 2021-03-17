package com.company;

public class Customer extends Person{


    public Customer(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
    }

    @Override
    public String toString(){
        return "Customer: \n" + getFirstName()+" "+getLastName() + "\nEmail Address: " + getEmailAddress();
    }


}
