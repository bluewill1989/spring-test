package com.mi.wzn.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

import static junit.framework.TestCase.assertEquals;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println("bean="+bean.getTestStr());
        assertEquals("testStr",bean.getTestStr());
    }

    @Test
    public void testSpringCleanPath(){
        String url = "d://1.txt";
        String url2 = StringUtils.cleanPath(url);
        System.out.println("url2="+url2);
    }

    @Test
    public void testSimpleLoad2(){
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//        AutowriedBean autowriedBean = (AutowriedBean) bf.getBean("autowriedBean");
//        if (autowriedBean == null){
//            System.out.println("见鬼了！！");
//        }
//        autowriedBean.showAutowriedBean();
//        MyTestBean2 bean = (MyTestBean2) bf.getBean("myTestBean2");
//        bean.print();


        ApplicationContext ctx =      new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean2 bean = (MyTestBean2) ctx.getBean("myTestBean2");
        bean.print();
    }
}
