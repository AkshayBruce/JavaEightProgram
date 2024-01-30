package com.example.javaeightprograms.Patterns;

public class Patternformat {

    public static void main(String[] args)
    {
        int n =5;

        for(int rows = 1; rows <=n;rows ++)
        {

            for (int columns=1; columns<= n; columns++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
