package com.entertainment.client;

import src.com.entertainment.DisplayType;
import src.com.entertainment.InvalidBrandException;
import src.com.entertainment.Television;

/*
 App main class
 */
class TelevisionClient {

    public static void main(String[] args)
    throws InvalidBrandException
    {

        System.out.println(Television.getInstanceCount() + " instances");
        // create an instance of Television
        Television tv1 = new Television("Samsung", 32, DisplayType.OLED);

        Television tv2 =new Television("LG", Television.MIN_VOLUME);

        Television tv3 = new Television();

        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();


        System.out.println(Television.getInstanceCount() + " instances");
    }



}
