package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("user4_fields_xml_annotation")
@PropertySource("classpath:myAppExample3.properties")
public class UserXMLAnnotationFields {
    @Autowired
    @Value("${user4.firstName}")
    private String firstName;
    @Value("${user4.lastName}")
    private String lastName;
    private AddressXMLAnnotationFields address;

    public UserXMLAnnotationFields() {}

    public UserXMLAnnotationFields(AddressXMLAnnotationFields address) {
        this.address = address;
    }

    public UserXMLAnnotationFields(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserXMLAnnotationFields(String firstName, String lastName, AddressXMLAnnotationFields address) {
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

    public AddressXMLAnnotationFields getAddress() {
        return address;
    }

    public void setAddress(AddressXMLAnnotationFields address) {
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
