package com.example.javaeightprograms.ArraysDSA;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, sum =0;

        System.out.println("Enter the size of elements: ");

        number = scan.nextInt();

        int alot[] = new int[number];

        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            alot[i] = scan.nextInt();
        }

        for (int num: alot)
        {
            sum = sum + num;
        }

        System.out.println("Sum of the elements in the array: "+ sum);
    }
}
