package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myAppExample3.properties")
@Component("user5_constructor_xml_annotation")
public class UserXMLAnnotationConstructor {
    private String firstName;
    private String lastName;
    private AddressXMLAnnotationConstructor address;

    public UserXMLAnnotationConstructor() {}

    public UserXMLAnnotationConstructor(AddressXMLAnnotationConstructor address) {
        this.address = address;
    }

    @Autowired
    public UserXMLAnnotationConstructor(@Value("${user5.firstName}") String firstName,
                                        @Value("${user5.lastName}") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserXMLAnnotationConstructor(String firstName, String lastName, AddressXMLAnnotationConstructor address) {
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

    public AddressXMLAnnotationConstructor getAddress() {
        return address;
    }

    public void setAddress(AddressXMLAnnotationConstructor address) {
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
