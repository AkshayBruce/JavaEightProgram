package com.example.javaeightprograms.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortcharArrayNoAPi {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        char charArray[] = {'a','d','C','B','b'};
        char tempChar;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i+1; j < charArray.length ; j++) {
                if (charArray[i] < charArray[j])
                {
                    tempChar = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = tempChar;
                }
            }
        }

        System.out.println("Sorted character array descending order: "+ Arrays.toString(charArray));
    }
}
