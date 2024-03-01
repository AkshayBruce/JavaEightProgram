package com.example.javaeightprograms.Recursions;

public class BasicRecursionStarter {

    public static void main(String[] args) {
    printNumbers(5);

        System.out.println("Reverse number:==========");
    reverseNumbers(5);
    }

    public static int printNumbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
        System.out.println(n);
        return printNumbers(n - 1);
    }

    static void reverseNumbers(int n)
    {
        if(n==0)
        {
            return;
        }
        reverseNumbers(n - 1);
        System.out.println(n);
    }
}
