package com.mi.wzn.test.aop.before;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GreetingBeforeIncepetor implements MethodInterceptor {

    public Object getProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return proxy;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println("How are you! " + clientName + "and we pleasure!!");
        methodProxy.invokeSuper(o, objects);
        return  null;
    }

    public static void main(String[] args) {
        NaiveWaiter waiter = (NaiveWaiter)new GreetingBeforeIncepetor().getProxy(NaiveWaiter.class);
        waiter.greetTo("weizenan");
        waiter.serverTo("李浩");
    }
}
