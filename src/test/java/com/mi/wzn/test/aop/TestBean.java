package com.mi.wzn.test.aop;

import lombok.Data;

@Data
public class TestBean {

    private String testStr = "testStr";

    public void test(){
        System.out.println("test!");
    }

}
