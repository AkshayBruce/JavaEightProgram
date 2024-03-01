package com.example.javaeightprograms.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sortArrayNoAPI {
    public static void main(String[] args) {

        int sizeArray, tempStorage;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of elements: ");

        sizeArray = scan.nextInt();
        int[] number = new int[sizeArray];
        System.out.println("Enter elements to sort array: "+ sizeArray);
        for (int i = 0; i < sizeArray; i++) {
           number[i] = scan.nextInt();
        }


        for (int i = 0; i < sizeArray; i++) {
            for (int j = i+1; j < sizeArray; j++)
            {
                if(number[i]> number[j]){
                    tempStorage = number[i];
                    number[i] = number[j];
                    number[j] = tempStorage;
                }
            }
        }
        //Arrays.sort(number);
        System.out.println("Sorted array list: "+ Arrays.toString(number));

        for (int i = 0; i < sizeArray; i++) {

            System.out.println("Descending array: "+ number[i]);
        }



    }
}
