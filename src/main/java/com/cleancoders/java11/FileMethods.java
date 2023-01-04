package com.cleancoders.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethods {
    public static void checkNewFileMethods() throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 file methods");
        System.out.println("Path : " + path);

        String content = Files.readString(path);
        System.out.println("File Content : " + content);
    }
}
