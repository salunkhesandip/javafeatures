package com.cleancoders.java11;

public class StringMethods {
    private static String str = " Java 11 features ";

    public static void checkNewStringMethods(){
        System.out.println("isBlank() : " + str.isBlank());
        System.out.println("strip() : "+ str.strip());
        System.out.println("stripLeading() :" + str.stripLeading());
        System.out.println("stripTrailing() :" + str.stripTrailing());
        System.out.println("repeat():" + str.repeat(3));

    }
}
