package com.mi.wzn.test.circledependency;

import lombok.Data;

@Data
public class TestC {
    private TestA testA;

    public TestC(TestA testA){
        this.testA = testA;
    }

    public void c(){
        testA.a();
    }
}
