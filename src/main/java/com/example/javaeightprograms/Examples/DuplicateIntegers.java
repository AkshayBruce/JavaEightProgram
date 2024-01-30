package com.example.javaeightprograms.Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateIntegers {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,22,1,23,22,18,19,17,18);

        Set<Integer> set =new HashSet<>();

        list.stream()
               .filter(n-> !set.add(n))
                .forEach(System.out::println);
    }

}
