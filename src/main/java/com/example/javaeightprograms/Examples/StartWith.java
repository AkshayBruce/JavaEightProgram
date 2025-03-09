package com.example.javaeightprograms.Examples;

import java.util.Arrays;
import java.util.List;

public class StartWith {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,23,11,12,56,101,22);

        list.stream()
                .map(s-> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

    }
}
