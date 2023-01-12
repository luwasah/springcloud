package com.ericsson.gateway.lambdaDemo;

public class FlyAbleDemo {
    public static void main(String[] args) {

//        FlyAble flyAble = new FlyAbleImpl();
//        useFlyAble(flyAble);


//        useFlyAble(new FlyAble() {
//            @Override
//            public void fly(String s) {
//                System.out.println(s);
//                System.out.println("飞机自驾游");
//            }
//        });

        useFlyAble((String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

    }

    public static void  useFlyAble(FlyAble f){
        f.fly("风和日丽, 晴空万里");
    }

}
