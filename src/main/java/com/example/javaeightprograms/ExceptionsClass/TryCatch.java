package com.example.javaeightprograms.ExceptionsClass;

public class TryCatch
{
    public static void main(String[] args) {

        try{

            int result = divideNumber(5,0);
            int result1 = divideNumber(6,30);

            System.out.println("Result:" + result);
            System.out.println("Result:" + result1);

        }catch(ArithmeticException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }
    }


    static int divideNumber(int dividend , int divisor)
    {
        if(dividend == 0)
            throw new ArithmeticException("Cannot divide any number with Zero....");
        return dividend / divisor;

    }
}
