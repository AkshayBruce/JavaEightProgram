package com.example.javaeightprograms.ArraysDSA;

import java.util.Arrays;
import java.util.List;

public class RunningSumOneDArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int n=2;

        int[] number =  runningSumOneDArray(nums,n);
        System.out.println(Arrays.toString(number));

        int[] numbers =  runningSumOneDArraySimilar(nums,n);
        System.out.println(Arrays.toString(numbers));

       runningSumOneDArrayNoExtraArray(nums,n);
        System.out.println(Arrays.toString(nums));

      //  List<Integer>

    }

    //TC: O(n) SC: O(n)
    static int[] runningSumOneDArray(int[] nums, int n)
    {
        int[] tempArray = new int[2 * n];

        for (int i = 0; i < n; i++) {

            tempArray[2*i] = nums[i];
            tempArray[(2*i)+1] = nums[i+n];
        }


        return tempArray;
    }

    //similar above code
    static int[] runningSumOneDArraySimilar(int[] nums, int n)
    {
        int[] tempArray = new int[2 * n];

        for (int i = 0,j=0; i < n; i++, j+=2) {

            tempArray[j] = nums[i];
            tempArray[j+1] = nums[i+n];
        }


        return tempArray;
    }


    //TC: O(n2) SC: O(1)
    static void runningSumOneDArrayNoExtraArray(int[] nums, int n)
    {
        for (int i = 0; i < n; i++) {

            int j =  i + n;
            int temp = nums[j];

            for (int k = j; k > i + 1; k--) {

                nums[k] = nums[k-1];
            }

            nums[i + 1] = temp;
        }
    }
}



