package com.cleancoders;

import com.cleancoders.java11.FileMethods;
import com.cleancoders.java11.StringMethods;
import com.cleancoders.java11.TimeUnitMethods;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Java 11 features");
        StringMethods.checkNewStringMethods();
        FileMethods.checkNewFileMethods();
        TimeUnitMethods.timeUnitMethods();
    }
}