package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myAppExample3.properties")
@ComponentScan("com.nikomu.exercise3")
@Component("address7_constructor_setter_field_annotation")
public class AddressAnnotationConstructorSetterField {
    public String streetName;
    public String home;
    @Value("${address7.room}")
    public String room;

    public AddressAnnotationConstructorSetterField() {}

    @Autowired
    public AddressAnnotationConstructorSetterField(@Value("${address7.streetName}") String streetName) {
        this.streetName = streetName;
    }

    public AddressAnnotationConstructorSetterField(String streetName, String home, String room) {
        this.streetName = streetName;
        this.home = home;
        this.room = room;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHome() {
        return home;
    }

    @Autowired
    public void setHome(@Value("${address7.home}") String home) {
        this.home = home;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        String tempString = Color.ANSI_RED.getCode() + "Address " + Color.ANSI_RESET.getCode() + "{";
        if(streetName != null) {
            tempString += "streetName = '" + Color.ANSI_GREEN.getCode() + this.streetName + Color.ANSI_RESET.getCode() + "\'";
        } if(home != null) {
            tempString += ", home = '" + Color.ANSI_GREEN.getCode() + this.home + Color.ANSI_RESET.getCode() + "\'";
        } if(room != null) {
            tempString += ", room = '" + Color.ANSI_GREEN.getCode() + this.room + Color.ANSI_RESET.getCode() + "\'";
        }
        tempString += "}";

        return tempString;
    }
}
