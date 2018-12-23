package com.mi.wzn.test.innermethod;

import org.springframework.beans.BeansException;

public class TestMain {
    public static void main(String[] args) {
        TestMain tm = new TestMain();
//        tm.print(new ObjectFactory() {
//            @Override
//            public Object getObject() throws BeansException {
//                return 4;
//            }
//        });
        tm.print(() -> 4);
    }

    public void print(ObjectFactory factory) {
        int i = 1;
        Object object = factory.getObject();
        System.out.println("object="+object);
    }
}
