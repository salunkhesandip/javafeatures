package com.cleancoders.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java9Features {
    public static void trywithResources() throws FileNotFoundException {
        FileOutputStream fs = new FileOutputStream("sample.txt");
        try(fs){
            String text = "Java 9 features";
            byte b[] = text.getBytes();
            fs.write(b);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
