package com.example.javaeightprograms.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    public void  predicateExamples() {
        System.out.println("filtering even numbers using predicates..");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> predicate = n ->  n % 2 == 0;

        for(Integer number : numbers) {
            if(predicate.test(number)) {
                System.out.println(number);
            }
        }

        String[]  std = {"mike", "Julie", "Anne", "Miky", "Nolan"};


    }
    public static void main(String[] args) {

    }
}
