package com.mi.wzn.test.circledependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/beanFactoryTest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMain {
    @Test
    public void testCircleByConstructor() throws Throwable {
        try {
            new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        } catch (BeansException e) {
            Throwable el = e.getCause().getCause().getCause();
            throw  el;
        }

    }
}
