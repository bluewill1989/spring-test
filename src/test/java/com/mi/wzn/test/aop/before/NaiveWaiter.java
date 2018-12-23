package com.mi.wzn.test.aop.before;

public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("thank you"+ name + "and welcome!!");
    }

    @Override
    public void serverTo(String name) {
        System.out.println("now i server"+ name + "and enjoy!!");
    }
}
