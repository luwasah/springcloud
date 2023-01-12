package com.ericsson.gateway.lambdaDemo;

import java.util.Hashtable;

public class EatDemo {
    public static void main(String[] args) {

//        EatAble e = new EatAbleImpl();
//        useEatAble(e);

//        useEatAble(new EatAble() {
//            @Override
//            public void eat() {
//                System.out.println("一天一苹果, 医生远离我");
//            }
//        });

        useEatAble(() -> {
            System.out.println("一天一苹果, 医生远离我");
        });


//        Hashtable


    }

    public static void useEatAble(EatAble e){
        e.eat();
    }

}
