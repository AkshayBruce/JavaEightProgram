package com.example.javaeightprograms.Miscmornings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsStringCase1 {
    public static void main(String[] args) {
        Stream<String> string = Stream.of("Hello", "Good", "Day");

        string.filter(s-> s.contains("o"))
                .map(String::toUpperCase)
                .forEach(System.out::print);


        List<Integer> test = new ArrayList<>();


    }
}
