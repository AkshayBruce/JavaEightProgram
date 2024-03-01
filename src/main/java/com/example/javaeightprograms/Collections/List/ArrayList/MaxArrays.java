package com.example.javaeightprograms.Collections.List.ArrayList;

public class MaxArrays {
    public static void main(String[] args) {

        int arr[] = {12,2,9,1,14};

        System.out.println(max(arr));

        System.out.println(max(arr, 0,3));
    }
    static int max(int[] arr) {
        int maxval =arr[0];

        for(int i =1; i<arr.length;i++)
        {
            if(arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
    return  maxval;
    }

    static int max(int[] arr, int start, int end)
    {
        int maxval = arr[start];

        for (int i = start; i < end ; i++) {

            if (arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
