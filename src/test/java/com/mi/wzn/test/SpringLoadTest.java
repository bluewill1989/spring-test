package com.mi.wzn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * DESCRIPTION:
 * spring的启动测试
 *
 * @author will
 * @create 2018-10-31 13:59
 */
@ContextConfiguration("/beanFactoryTest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringLoadTest {

//    @Autowired
//    MyTestBean myTestBean;
    @Autowired
    MyTestBean2 myTestBean2;

    @Test
    public void testAutowired(){
        myTestBean2.print();
    }


}