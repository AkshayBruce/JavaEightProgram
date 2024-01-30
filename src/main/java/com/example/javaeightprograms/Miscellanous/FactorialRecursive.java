package com.example.javaeightprograms.Miscellanous;

public class FactorialRecursive {

    public static void main(String[] args)
    {

      //  System.out.println("Recursive Factorial of the given number:"+ recursiveFactorial(5));
        System.out.println("Iterative Factorial of the given number:"+ iterativeFactorial(5));
    }

    private static int recursiveFactorial(int number)
    {

            if(number == 1)
                return 1;
            else
                return number * recursiveFactorial(number-1);
    }

    private static int iterativeFactorial(int number)
    {
        int result = 1, startNumber;

        for (startNumber = 2; startNumber <= number; startNumber++)
        {
            result *= startNumber;

        }
        return result;
    }

}
