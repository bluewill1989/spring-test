package com.mi.wzn.test.circle;

import lombok.Setter;

public class TestB {
    @Setter
    private TestA a;

    private void print(){
       a.printA();
    }

    public void printB(){
        System.out.println("this is B!!");
    }
}
