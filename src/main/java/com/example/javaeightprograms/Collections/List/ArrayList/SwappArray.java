package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.Arrays;

public class SwappArray {
    public static void main(String[] args) {

        int arr[]={1,9,11,29,55};

        swap(arr, 1,3);

        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int start, int end) {

            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
    }
}
