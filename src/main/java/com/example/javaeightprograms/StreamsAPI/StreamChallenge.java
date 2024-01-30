package com.example.javaeightprograms.StreamsAPI;

import java.util.Arrays;
import java.util.List;

public class StreamChallenge {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "fun", "and", "challenging");

        int count = (int)words.stream()
                .filter(word -> word.length() > 3 )
                .map(String::length)
                .count();

        System.out.println(count);
    }
}
