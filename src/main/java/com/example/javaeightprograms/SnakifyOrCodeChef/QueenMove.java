package com.example.javaeightprograms.SnakifyOrCodeChef;

import java.util.Scanner;

public class QueenMove {
    public static void main(String[] args) {

        int x1=0, x2=0, y1=0, y2 =0;
        Scanner  scan = new Scanner(System.in);


        System.out.println("===========Enter numerics to move Queen:============");
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
        
        if((x1==x2)|| (y1==y2))
        {
            System.out.println("Queen step a head diagonal....");
        } else if (xaxis == yaxis) {
            System.out.println("Queen step a head straight...");
        } else  {
            System.out.println(" Halt!!! Queen can move either diagonal or straight a head ...");

        }

    }
}
