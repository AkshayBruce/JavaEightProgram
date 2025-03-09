package com.example.javaeightprograms.ArraysDSA;

public class ArrayEx {
    public static void main(String[] args) {
        int[]  array ={5,4,3,2,1};

        Integer i = 256;
        byte b = i.byteValue();

        System.out.println(b);

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
