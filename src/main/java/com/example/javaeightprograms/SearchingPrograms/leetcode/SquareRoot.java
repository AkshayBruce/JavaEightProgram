package com.example.javaeightprograms.SearchingPrograms.leetcode;

public class SquareRoot {
    public static void main(String[] args) {

        int x =4;
        int y =8;

        //System.out.println(squareRootNoBuildinMethod(x));
        System.out.println(squareRootNoBuildinMethod(y));

    }

    static int squareRootNoBuildinMethod(int x)
    {
        if(x==0 || x==1)
        {
            return x;
        }

        long left= 1;
        long right =x;

        while(left<=right)
        {
            long mid = left + (right - left)/2;
            long square =  mid * mid;

            if(square == x)
            {
                return (int)mid;
            } else if (square<x) {
                left = mid + 1;
            } else
            {
                right = mid - 1;
            }
        }

        return (int) right ;
    }

}
