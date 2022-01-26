package com.nikomu.exercise3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nikomu.exercise3")
@PropertySource("classpath:myAppExample3.properties")
public class ConfigFileExample3 {

    @Value("${address8.streetName}")
    String streetName8;
    @Value("${address8.home}")
    String home8;
    @Value("${address8.room}")
    String room8;
    @Bean("address8_configJavaClass_constructor")
    public Address address8() {
        return new Address(streetName8, home8, room8);
    }

    @Value("${address9.streetName}")
    String streetName9;
    @Value("${address9.home}")
    String home9;
    @Value("${address9.room}")
    String room9;
    @Bean("address9_configJavaClass_setters")
    public Address address9() {
        Address newAddress = new Address();
        newAddress.setStreetName(streetName9);
        newAddress.setHome(home9);
        newAddress.setRoom(room9);
        return newAddress;
    }

    @Value("${address10.streetName}")
    String streetName10;
    @Value("${address10.home}")
    String home10;
    @Value("${address10.room}")
    String room10;
    @Bean("address10_configJavaClass_constructor_setters")
    public Address address10() {
        Address newAddress = new Address(streetName10);
        newAddress.setHome(home10);
        newAddress.setRoom(room10);
        return newAddress;
    }

    @Value("${user8.firstName}")
    String firstName8;
    @Value("${user8.lastName}")
    String lastName8;
    @Bean("user8_configJavaClass_constructor")
    public User user8() {
        return new User(firstName8, lastName8, address8());
    }

    @Value("${user9.firstName}")
    String firstName9;
    @Value("${user9.lastName}")
    String lastName9;
    @Bean("user9_configJavaClass_setters")
    public User user9() {
        User newUser = new User();
        newUser.setFirstName(firstName9);
        newUser.setLastName(lastName9);
        newUser.setAddress(address9());
        return newUser;
    }
    
    @Value("${user10.firstName}")
    String firstName10;
    @Value("${user10.lastName}")
    String lastName10;
    @Bean("user10_configJavaClass_constructor_setter")
    public User user10() {
        User newUser = new User(firstName10, lastName10);
        newUser.setAddress(address10());
        return newUser;
    }
}
