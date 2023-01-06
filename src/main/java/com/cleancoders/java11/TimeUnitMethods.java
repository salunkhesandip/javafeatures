package com.cleancoders.java11;

import java.util.concurrent.TimeUnit;

public class TimeUnitMethods {
    public static void timeUnitMethods(){
        long hours = 24;
        System.out.println("Convert " + hours + " hours to Days :" + TimeUnit.DAYS.convert(hours, TimeUnit.HOURS));
        System.out.println("Convert " + hours + " hours to minutes :" + TimeUnit.MINUTES.convert(hours, TimeUnit.HOURS));
        System.out.println("Convert " + hours + " hours to seconds :" + TimeUnit.HOURS.toSeconds(hours));
    }
}