package com.cleancoders.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

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
    public static void immutableCollection(){
        List<String> immutableList = List.of("java", "kotlin", "groovy");
        //immutableList.add("Go"); -- result in error
        // Before Java 9 Collections.unmodifiableList() needs to call to create immutable list.
        Set<Integer> primes = Set.of(2,3,5,7);
        System.out.println("Set " + primes);

        Map<String, Integer> map = Map.of(
                "One",1,
                "Two", 2,
                "Three", 3
        );
        map.forEach((k, v) -> System.out.println(k + "-" + v));

        Map<String, Integer> mapOfEntries = Map.ofEntries(
                entry("One", 1),
                entry("two", 2),
                entry("three", 3)
        );
        mapOfEntries.forEach((k,v) -> System.out.println(k + "-" + v));
    }
}
