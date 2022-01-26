package com.nikomu.exercise2;

import com.nikomu.main_menu.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myAppExample2.properties")
public class CarBrand {
    @Autowired
    @Value("${carBrands1}")
    private String[] carBrandName;

    public CarBrand() {}

    public String[] getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String[] carBrandName) {
        this.carBrandName = carBrandName;
    }

    @Override
    public String toString() {
        String tempString = Color.ANSI_RED.getCode() + "CarBrand " + Color.ANSI_RESET.getCode() + "{";
        if(carBrandName.length > 0) {
            tempString += "carBrandName = [";
            for(int i = 0; i < carBrandName.length; i++) {
                tempString += "'" + Color.ANSI_GREEN.getCode() + carBrandName[i] + Color.ANSI_RESET.getCode() + "'";
                if(i < carBrandName.length - 1) {
                    tempString += ", ";
                }
            }
            tempString += "]}";
        }

        return  tempString;
    }
}
