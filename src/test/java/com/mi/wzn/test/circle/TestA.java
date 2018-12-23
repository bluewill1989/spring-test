package com.mi.wzn.test.circle;

import com.mi.wzn.test.MyTestBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static junit.framework.TestCase.assertEquals;

public class TestA {
    @Setter
    private TestB b;

    private void print(){
        b.printB();
    }

    public void printA(){
        System.out.println("this is A!!");
    }

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryCircleTest.xml"));



        TestA bean = (TestA) bf.getBean("testa");
        bean.print();
    }
}
