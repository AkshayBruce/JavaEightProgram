package com.example.javaeightprograms.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[]  array ={5,4,3,2,1};


        arraytestCode(array);

        System.out.println("Reversed array...");

        for (int num: array)
        {
            System.out.println(num+" ");
        }
    }

    public static void arraytestCode(int[] array)
    {
        int start =0, end= array.length-1;

        int temp;

        while(start<end)
        {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

    }
}
