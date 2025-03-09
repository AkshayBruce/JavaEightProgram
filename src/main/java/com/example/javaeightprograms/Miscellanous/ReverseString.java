package com.example.javaeightprograms.Miscellanous;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        int fullname = name.length() - 1;

        int start = 0;
        int end = name.charAt(fullname)-1 ;


        int temp = 0;
        while (end > start) {
            temp = end;
            end--;
        }
        System.out.println(temp);
    }
}
