package com.mi.wzn.test.aop.before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GreetingBeforeHandler implements InvocationHandler {
    private Object target;

    GreetingBeforeHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String clientName = (String)args[0];
        System.out.println("How are you! " + clientName + "and we pleasure!!");
        method.invoke(target, args);
//        int i = (int)method.invoke(target, args);
//        System.out.println("this is "+i);
        return null;
    }

    public static void main(String[] args) {
        GreetingBeforeHandler gh = new GreetingBeforeHandler(new NaiveWaiter());
        Waiter proxy = (Waiter) Proxy.newProxyInstance(NaiveWaiter.class.getClassLoader(), NaiveWaiter.class.getInterfaces(), gh);
        proxy.greetTo("weizenan");
        proxy.serverTo("李浩");
    }
}
