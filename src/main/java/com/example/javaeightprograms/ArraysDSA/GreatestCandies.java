package com.example.javaeightprograms.ArraysDSA;

import java.util.Arrays;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3};
        int extraCandies =  3;

        boolean[] greatestNumberOfCandies = kidsWithCandies(candies,extraCandies);

        System.out.println(Arrays.toString(greatestNumberOfCandies));

    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies)
    {
        int maxcandies = candies[0];

        for (int i = 1; i < candies.length ; i++) {

            if (candies[i] > maxcandies)
            {
                maxcandies = candies[i];
            }
        }

        boolean[] result  =  new boolean[candies.length];

        for (int i =0; i< candies.length; i++)
        {
            result[i] = candies[i] + extraCandies >= maxcandies;
        }

        return result;
    }
}
