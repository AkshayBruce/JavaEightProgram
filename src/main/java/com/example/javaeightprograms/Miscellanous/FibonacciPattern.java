package com.example.javaeightprograms.Miscellanous;

public class FibonacciPattern
{
    public static void main(String[] args) {

        for(int i =0;i<=5;i++) {
           // System.out.println("fibonacci series using Iterative " + fibonacciIterative(i));
        }

        for(int i =0;i<=4;i++)
        {
            System.out.println("fibonacci series using  Recursion"+ fibonacciRecursive(i)+" ");
        }
    }

    private static int fibonacciIterative(int number) {
        int previousNumber = 0, nextNumber = 1, fibonacciNumber = 0;

        for (int i = 2; i <= number; i++) {
            fibonacciNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = fibonacciNumber;

        }

        return fibonacciNumber;
    }

    /**
     *  Formula for fibonacci
     *  fn =  f(n-1) + f(n-2)
     */
    public static int fibonacciRecursive(int number)
    {
        if(number ==0)
        {
            return 0;
        }
        if(number == 1 || number == 2)
        {
            return 1;
        }

        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);

    }
}
