/******************************************************************************************
    3. Создать User (firstName, lastName, address), Address (name, home, room).
 Сами данные хранятся в myAppExample2.properties.
 Решить эту задачу двумя способами.
 *****************************************************************************************/

package com.nikomu.exercise3;

import com.nikomu.main_menu.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercise3App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextExample3_1.xml");

        Address address1 = context.getBean("address1_setters_and_xml", Address.class);
        Message.headerMessage("\nАдрес №1 (создан при помощи XML и сеттеров): \n");
        System.out.println(address1);

        Address address2 = context.getBean("address2_constructor_and_xml", Address.class);
        Message.headerMessage("\nАдрес №2 (создан при помощи XML и конструктора): \n");
        System.out.println(address2);

        Address address3 = context.getBean("address3_constructor_and_setters_and_xml", Address.class);
        Message.headerMessage("\nАдрес №3 (создан при помощи XML, конструктора и сеттеров): \n");
        System.out.println(address3);

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextExample3_2.xml");

        AddressXMLAnnotationFields address4 = context2.getBean("address4_fields_xml_annotation", AddressXMLAnnotationFields.class);
        Message.headerMessage("\nАдрес №4 (создан при помощи XML, аннотаций и полей): \n");
        System.out.println(address4);

        AddressXMLAnnotationConstructor address5 = context2.getBean("address5_constructor_xml_annotation", AddressXMLAnnotationConstructor.class);
        Message.headerMessage("\nАдрес №5 (создан при помощи XML, аннотаций и конструктора): \n");
        System.out.println(address5);

        AddressXMLAnnotationSetters address6 = context2.getBean("address6_setters_xml_annotation", AddressXMLAnnotationSetters.class);
        Message.headerMessage("\nАдрес №6 (создан при помощи XML, аннотаций и сеттеров): \n");
        System.out.println(address6);

        AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(AddressAnnotationConstructorSetterField.class);

        AddressAnnotationConstructorSetterField address7 = context3.getBean("address7_constructor_setter_field_annotation", AddressAnnotationConstructorSetterField.class);
        Message.headerMessage("\nАдрес №7 (создан при помощи аннотаций, конструктора, поля и сеттера): \n");
        System.out.println(address7);

        AnnotationConfigApplicationContext context4 = new AnnotationConfigApplicationContext(ConfigFileExample3.class);

        Address address8 = context4.getBean("address8_configJavaClass_constructor", Address.class);
        Message.headerMessage("\nАдрес №8 (создан при помощи конфигурационного Java класса и конструктора): \n");
        System.out.println(address8);

        Address address9 = context4.getBean("address9_configJavaClass_setters", Address.class);
        Message.headerMessage("\nАдрес №9 (создан при помощи конфигурационного Java класса и сеттеров): \n");
        System.out.println(address9);

        Address address10 = context4.getBean("address10_configJavaClass_constructor_setters", Address.class);
        Message.headerMessage("\nАдрес №10 (создан при помощи конфигурационного Java класса, конструктора и сеттеров): \n");
        System.out.println(address10);


        User user1 = context.getBean("user1_constructor_and_setter_and_xml", User.class);
        Message.headerMessage("\nПользователь №1 (создан при помощи XML, конструктора, сеттера и адреса №3): \n");
        System.out.println(user1);

        User user2 = context.getBean("user2_constructor_and_xml", User.class);
        Message.headerMessage("\nПользователь №2 (создан при помощи XML, конструктора и адреса №2): \n");
        System.out.println(user2);

        User user3 = context.getBean("user3_setters_and_xml", User.class);
        Message.headerMessage("\nПользователь №3 (создан при помощи XML, сеттеров и адреса №1): \n");
        System.out.println(user3);

        UserXMLAnnotationFields user4 = context2.getBean("user4_fields_xml_annotation", UserXMLAnnotationFields.class);
        Message.headerMessage("\nПользователь №4 (создан при помощи XML, аннотаций и полей): \n");
        user4.setAddress(address4);
        System.out.println(user4);

        UserXMLAnnotationConstructor user5 = context2.getBean("user5_constructor_xml_annotation", UserXMLAnnotationConstructor.class);
        Message.headerMessage("\nПользователь №5 (создан при помощи XML, аннотаций и конструктора): \n");
        user5.setAddress(address5);
        System.out.println(user5);


        UserXMLAnnotationSetters user6 = context2.getBean("user6_setters_xml_annotation", UserXMLAnnotationSetters.class);
        Message.headerMessage("\nПользователь №6 (создан при помощи XML, аннотаций и сеттеров): \n");
        user6.setAddress(address6);
        System.out.println(user6);

        UserAnnotationConstructorSetterField user7 = context2.getBean("user7_constructor_setter_field_annotation", UserAnnotationConstructorSetterField.class);
        Message.headerMessage("\nПользователь №7 (создан при помощи аннотаций, конструктора, поля и сеттера): \n");
        user7.setAddress(address7);
        System.out.println(user7);

        User user8 = context4.getBean("user8_configJavaClass_constructor", User.class);
        Message.headerMessage("\nПользователь №8 (создан при помощи конфигурационного Java класса и конструктора): \n");
        System.out.println(user8);

        User user9 = context4.getBean("user9_configJavaClass_setters", User.class);
        Message.headerMessage("\nПользователь №9 (создан при помощи конфигурационного Java класса и сеттеров): \n");
        System.out.println(user9);

        User user10 = context4.getBean("user10_configJavaClass_constructor_setter", User.class);
        Message.headerMessage("\nПользователь №10 (создан при помощи конфигурационного Java класса, конструктора и сеттера): \n");
        System.out.println(user10);

        context.close();
        context2.close();
        context3.close();
        context4.close();
    }
}
