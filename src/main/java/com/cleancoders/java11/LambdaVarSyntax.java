package com.cleancoders.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaVarSyntax {
    public static void checkVarSyntax(){
        List<String> list = Arrays.asList("a", "b", "c");
        String result = list.stream().map(( var x) ->x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
