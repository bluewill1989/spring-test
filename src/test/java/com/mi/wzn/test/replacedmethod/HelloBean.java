package com.mi.wzn.test.replacedmethod;

public class HelloBean {
    private String args1;

    private String args2;

    public HelloBean(String value1,String value2){
        this.args1 = value1;
        this.args2 = value2;
    }

    public HelloBean(String value1){
        this.args1 = value1;
    }

    public void print(){
        System.out.println("args1=" + args1);
        System.out.println("args2=" + args2);
    }
}
