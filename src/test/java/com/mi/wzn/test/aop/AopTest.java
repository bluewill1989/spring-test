package com.mi.wzn.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("aoptest.xml");
        TestBean bean = (TestBean) bf.getBean("test");
        bean.test();
    }
}
