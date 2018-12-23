package com.mi.wzn.test;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTestBean {

    @Autowired
    AutowriedBean autowriedBean;

    @Setter
//    @Getter
    private String key1;


    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    private String testStr = "testStr";

    public void print(){
        System.out.println("this is my test bean!!!");
        System.out.println("-----------------------");
        autowriedBean.showAutowriedBean();
    }


}
