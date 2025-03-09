package com.example.javaeightprograms.MisEvenings;

import java.util.Scanner;

public class IntFloat {
    public static void main(String[] args) {
        float a = 123456789.7f;
        int b = (int) a;

        System.out.println(b);
        decre(5);
      }

    static void decre(int n)
    {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        decre(--n);
        //n--;
    }

}
