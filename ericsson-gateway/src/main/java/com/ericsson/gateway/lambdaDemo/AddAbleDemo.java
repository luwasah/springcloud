package com.ericsson.gateway.lambdaDemo;

import java.util.ArrayList;
import java.util.List;

public class AddAbleDemo {
    public static void main(String[] args) {

//        useAddAble((int a, int b) -> {
//            int sum = a + b;
//            return sum;
//        });

//        useAddAble((a, b) -> {
//            return a + b;
//        });
//
//        useFlyAble((String s) -> {
//            System.out.printf(s);
//            System.out.println("展翅高飞!");
//        });
//
//        useFlyAble(s -> {
//            System.out.printf(s);
//            System.out.println("展翅高飞!");
//        });

        //如果代码块只有一条语句, 可以省略掉大括号和分号
        useFlyAble(s -> System.out.println("雪在飞"));

        //如果代码块只有一条语句, 可以省略掉大括号和分号; 但如果有return, return也要省略掉
        useAddAble((x, y) ->  x+y);

        List<String> list = new ArrayList();

        list.forEach(v -> System.out.println(v));

    }

    public static void useAddAble(AddAble a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

    public static void useFlyAble(FlyAble f){
        f.fly("飞吧飞吧");
    }
}
