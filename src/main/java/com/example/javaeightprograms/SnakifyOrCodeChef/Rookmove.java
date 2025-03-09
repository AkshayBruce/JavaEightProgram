package com.example.javaeightprograms.SnakifyOrCodeChef;

import java.util.Scanner;

public class Rookmove {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter numbers to move rook/ Elephant....");
        System.out.println("Enter x: ");
        int x = scan.nextInt();
        System.out.println("Enter y: ");
        int y = scan.nextInt();

        if(x == y && y == x)
        {
            System.out.println("No");
        }else
        {
            System.out.println("Yes");
        }

    }
}
