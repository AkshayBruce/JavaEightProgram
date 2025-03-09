package com.example.javaeightprograms.Examples;

import java.util.*;

public class Findfirst {
    public static void main(String args[]) {

            List<Integer> list = Arrays.asList(21,22,29,30);

            list.stream()
                    .findFirst()
                    .ifPresent(System.out::println);

    }

}
