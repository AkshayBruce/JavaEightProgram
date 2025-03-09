package com.example.javaeightprograms.Patterns;

public class PatternDecreasingStars {
    public static void main(String[] args) {

        int n = 5;

        for(int rows=1;rows<=n;rows++)
        {
            for(int columns=rows;columns<=n;columns++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
