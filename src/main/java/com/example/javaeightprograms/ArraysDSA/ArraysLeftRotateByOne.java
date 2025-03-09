package com.example.javaeightprograms.Arrays;

public class ArraysLeftRotateByOne {

    public static void main(String[] args) {
        int n=5;
        int[] array ={1,2,3,4,5};

        //Brute Force
        solveRotateArray(array,n);

        //Optimal
        solveRotateArrayoptimal(array,n);
    }

    public static void solveRotateArrayoptimal(int[] array, int n) {

        int temp = array[0];

        for (int i = 0; i < n-1; i++) {
            array[i] = array[i+1];
        }

        array[n-1] = temp;
        for (int i = 0; i < n ; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void solveRotateArray(int[] array, int n) {

        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i-1] = array[i];
        }

        temp[n-1] =array[0];
        for (int i = 0; i < n; i++) {

            System.out.print(temp[i]+" ");
        }

    }
}
