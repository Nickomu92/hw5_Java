package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myAppExample3.properties")
@Component("user6_setters_xml_annotation")
public class UserXMLAnnotationSetters {
    private String firstName;
    private String lastName;
    private AddressXMLAnnotationSetters address;

    public UserXMLAnnotationSetters() {}

    public UserXMLAnnotationSetters(AddressXMLAnnotationSetters address) {
        this.address = address;
    }

    public UserXMLAnnotationSetters(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserXMLAnnotationSetters(String firstName, String lastName, AddressXMLAnnotationSetters address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Autowired
    public void setFirstName(@Value("${user6.firstName}")String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Autowired
    public void setLastName(@Value("${user6.lastName}") String lastName) {
        this.lastName = lastName;
    }

    public AddressXMLAnnotationSetters getAddress() {
        return address;
    }

    public void setAddress(AddressXMLAnnotationSetters address) {
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
