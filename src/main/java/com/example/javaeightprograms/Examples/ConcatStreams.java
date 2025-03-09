package com.example.javaeightprograms.Examples;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class ConcatStreams {

    public static void main(String[] args){

        String string1 = "Hello, ";
        String string2 = "world!";

        // Using String concatenation
        String result1 = string1 + string2;
        System.out.println("Using String concatenation: " + result1);

        // Using String.join
        StringJoiner joiner = new StringJoiner("");
        String result2 = joiner.add(string1).add(string2).toString();
        System.out.println("Using String.join: " + result2);

    }
}
