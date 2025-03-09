package com.example.javaeightprograms.SnakifyOrCodeChef;

import java.util.Scanner;

public class KnightMove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = 0,x2 = 0,y1 = 0,y2 = 0;

        System.out.println("===========Enter numerics to move Knight:============");
        System.out.println("Enter x1 of xaxis value :");
        x1 = scan.nextInt();

        System.out.println("Enter x2 of xaxis value :");
        x2 = scan.nextInt();

        System.out.println("Enter y1 of yaxis value :");
        y1 = scan.nextInt();

        System.out.println("Enter y2 of yaxis value :");
        y2 = scan.nextInt();

        int xaxis = (x1-x2);
        int yaxis = (y1-y2);
        if(xaxis<0)
        {
            xaxis *= -1;
        }
        if(yaxis<0)
        {
            yaxis *= -1;
        }

        if(xaxis ==1 && yaxis ==2 )
        {
            System.out.println("Knight moved...");
        } else if (xaxis ==2 && yaxis ==1) {
            System.out.println("knight moved...");
        }else
        {
            System.out.println("Knight can be move L shape...");
        }
    }
}
