package com.nikomu.exercise3;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:myAppExample3.properties")
@Component("address5_constructor_xml_annotation")
public class AddressXMLAnnotationConstructor {
    public String streetName;
    public String home;
    public String room;

    public AddressXMLAnnotationConstructor() {}

    public AddressXMLAnnotationConstructor(String streetName) {
        this.streetName = streetName;
    }

    @Autowired
    public AddressXMLAnnotationConstructor(@Value("${address5.streetName}") String streetName,
                                           @Value("${address5.home}") String home,
                                           @Value("${address5.room}") String room) {
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

    public void setHome(String home) {
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
