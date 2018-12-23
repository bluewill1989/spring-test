package com.mi.wzn.test.circledependency;

import lombok.Data;

@Data
public class TestB {
    private TestC testC;

    public TestB(TestC testC){
        this.testC = testC;
    }

    public void b(){
        testC.c();
    }
}
