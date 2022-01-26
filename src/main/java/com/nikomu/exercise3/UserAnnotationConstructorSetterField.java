package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myAppExample3.properties")
@ComponentScan("com.nikomu.exercise3")
@Component("user7_constructor_setter_field_annotation")
public class UserAnnotationConstructorSetterField {
    @Autowired
    @Value("${user7.firstName}")
    private String firstName;
    private String lastName;
    private AddressAnnotationConstructorSetterField address;

    public UserAnnotationConstructorSetterField() {}

    @Autowired
    public UserAnnotationConstructorSetterField(AddressAnnotationConstructorSetterField address) {
        this.address = address;
    }

    public UserAnnotationConstructorSetterField(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserAnnotationConstructorSetterField(String firstName, String lastName, AddressAnnotationConstructorSetterField address) {
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

    @Autowired
    public void setLastName(@Value("${user7.lastName}") String lastName) {
        this.lastName = lastName;
    }

    public AddressAnnotationConstructorSetterField getAddress() {
        return address;
    }

    public void setAddress(AddressAnnotationConstructorSetterField address) {
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
