package com.mi.wzn.test.replacedmethod;

import com.mi.wzn.test.lookup.GetBeanTest;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacedMethodTest {
    public static void main(String[] args) {
        replacedMethodTest();
//        constructorTest();
//        PropertyValueTest();
//        userTest();
    }

    private static void userTest() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("replacedmethod.xml");

//        User user = (User) bf.getBean("user"); //拿到User实例
        Object fb = bf.getBean("&user");  //拿到factoryBean实例
    }

    private static void PropertyValueTest() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("replacedmethod.xml");

        PropertyValue test = (PropertyValue) bf.getBean("propertyValue");
        test.print();

    }

    private static void constructorTest() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("replacedmethod.xml");
        HelloBean test = (HelloBean) bf.getBean("helloBean");
        test.print();
    }

    private static void replacedMethodTest() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("replacedmethod.xml");
        TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
        test.changeMe();
    }
}
