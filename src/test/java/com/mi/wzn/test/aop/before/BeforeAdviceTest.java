package com.mi.wzn.test.aop.before;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAdviceTest {
    @Test
    public void before(){
//        Waiter waiter = new NaiveWaiter();
        NaiveWaiter waiter= new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setInterfaces(waiter.getClass().getInterfaces());
//        proxyFactory.setInterfaces(waiter2.getClass().getInterfaces());



        proxyFactory.setTarget(waiter);

        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter)proxyFactory.getProxy();
        proxy.greetTo("维泽南");
        proxy.serverTo("lilei");
    }

    @Test
    public void before2(){
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("aoptest1.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        waiter.serverTo("维泽南");
        waiter.greetTo("lilei");

    }
}
