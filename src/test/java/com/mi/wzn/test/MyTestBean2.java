package com.mi.wzn.test;


import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MyTestBean2 {


//    @Autowired
    AutowriedBean autowriedBean;

    @PostConstruct
    public void init(){
        System.out.println("测试 context:annotation-config起作用没");
    }

//    @Setter
////    @Getter
//    private String key1;


//    public String getTestStr() {
//        return testStr;
//    }
//
//    public void setTestStr(String testStr) {
//        this.testStr = testStr;
//    }
//
//    private String testStr = "testStr";

    public void print(){
        System.out.println("this is my test bean!!!");
        System.out.println("-----------------------");
        autowriedBean.showAutowriedBean();
    }


}
