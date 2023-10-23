package com.entertainment.client;

import src.com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {



        Television tv = new Television();
        Television tv5 = new Television("Sony", -1); // should give error due to ctor

        tv.setVolume(0);
        System.out.println(tv);         // good

        tv.setVolume(100);
        System.out.println(tv);         // good

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);         // shoud give error and keep last value of volume


        System.out.println();
        System.out.println();


        // the valid options are only Samsung, LG and Sony
        Television tv10 = new Television();

        tv10.setBrand("Samsung");
        System.out.println(tv10);

        tv10.setBrand("LG");
        System.out.println(tv10);

        tv10.setBrand("Sony");
        System.out.println(tv10);

        tv10.setBrand("Siemens");
        System.out.println(tv10);

    }
}