package com.mi.wzn.test.circledependency;

import lombok.Data;

@Data
public class TestA {
    private TestB testB;

    public TestA(TestB testB){
        this.testB = testB;
    }

    public void a(){
        testB.b();
    }
}
