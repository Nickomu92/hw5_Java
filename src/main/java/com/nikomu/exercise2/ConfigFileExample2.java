package com.nikomu.exercise2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myAppExample2.properties")
public class ConfigFileExample2 {

    @Bean
    @Scope("singleton")
    public CarBrand carBrand() {
        return new CarBrand();
    }
}
