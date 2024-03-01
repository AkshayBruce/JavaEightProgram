package com.example.javaeightprograms.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPredicate {
    public static void main(String[] args) {

        usingPartitionInPredicate();
    }

    static void usingPartitionInPredicate()
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partitionNumber = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 !=0 ));

        System.out.println("List of even and odd  numbers:" + partitionNumber);

    }
}
