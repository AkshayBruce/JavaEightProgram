package com.example.javaeightprograms.Examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonIntegers {
    public static void main(String[] args) {

        Integer[] integersArrayOne ={2, 4, 7, 9, 10, 17};
        Integer[] secondIntegerArray ={3,5,7, 10};

        List<Integer> comparingArrayOfIntegers = Arrays.asList(secondIntegerArray);

        List<Integer> commonIntegers = Arrays.stream(integersArrayOne)
                .filter(comparingArrayOfIntegers::contains)
                .collect(Collectors.toList());

        System.out.println(commonIntegers);

    }
}
