/******************************************************************************************
    2. Создать бин типа String[], например модели авто.
 Сами модели хранятся в myAppExample2.properties.
 *****************************************************************************************/

package com.nikomu.exercise2;

import com.nikomu.main_menu.Message;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootConfiguration
public class Exercise2App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigFileExample2.class);
        CarBrand brandList = context1.getBean("carBrand", CarBrand.class);
        Message.headerMessage("\nBean carBrand + configJavaClass + fields DI\n");
        System.out.println(brandList);
        context1.close();

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextExample2_1.xml");
        CarBrand brandList2 = context2.getBean("carBrands2", CarBrand.class);
        Message.headerMessage("\nBean carBrand2 + configXmlFile + setters DI\n");
        System.out.println(brandList2);
        context2.close();
    }
}
