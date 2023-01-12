package com.ericsson.gateway.lambdaDemo;

public class EatAbleImpl implements EatAble{
    @Override
    public void eat() {
        System.out.println("一天一苹果, 医生远离我");
    }
}
