package com.example.javaeightprograms.Recursions;

public class PrintRecursion {
    public static void main(String[] args) {
        int n=5;
        recursion(n,1);
    }

    static void recursion(int n, int i)
    {
        if(n>i) return;
        System.out.println(i);
        recursion(n, i+1);
    }
}
