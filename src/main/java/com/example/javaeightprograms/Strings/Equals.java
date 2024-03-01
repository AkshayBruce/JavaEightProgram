package com.example.javaeightprograms.Strings;

public class Equals {
    public static void main(String[] args) {

        String name = "akshay";
        String word = "akshay";

        String string = new String("akshay");
        String string2 = new String("akshay");

        System.out.println(string == string2);
        System.out.println(string.equals(string2));

        System.out.println(name == word);
        System.out.println(name.equals(word));

        Integer number = 56;


    }
}
