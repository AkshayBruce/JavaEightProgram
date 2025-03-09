package com.example.javaeightprograms.Examples;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(21,22,29,30);

            int maxValue= list.stream()
                    .max(Integer::compare)
                    .get();

        System.out.println(maxValue);

    }
}
