package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;

public class User {
    private String firstName;
    private String lastName;
    private Address address;

    public User() {}

    public User(Address address) {
        this.address = address;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String tempStr = Color.ANSI_YELLOW.getCode() + "User " + Color.ANSI_RESET.getCode() + "{";

        if (firstName != null) {
            tempStr += "firstName = '" + Color.ANSI_CYAN.getCode() + firstName + Color.ANSI_RESET.getCode() + "\'";
        }
        if (lastName != null) {
            tempStr +=", lastName = '" +  Color.ANSI_CYAN.getCode() + lastName + Color.ANSI_RESET.getCode() + "\'";
        }
        if (address != null) {
            tempStr += ", address = " + address;
        }

        tempStr += "}";

        return tempStr;
    }
}
