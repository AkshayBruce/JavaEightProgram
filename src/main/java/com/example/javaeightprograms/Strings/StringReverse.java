package com.example.javaeightprograms.Strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String word, reverseString =" ";

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the word:");

        word = scan.next();

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        System.out.println("Reverse of the given string: "+reverseString);

    }
}

class StringReverseNByTwo
{
    String name = "Akshay";

}
