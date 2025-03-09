package com.example.javaeightprograms.Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x > 10000;
        System.out.println(predicate.test(1000));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    }
}
