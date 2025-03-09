package com.example.javaeightprograms.Arrays;

public class CheckSortArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,7};

        checkArraySorted(array);
        System.out.println(checkArraySorted(array));

        checkArraySortedOptimal(array);
        System.out.println(checkArraySortedOptimal(array));
    }
    /*Brute force technique
    * TC: O Nsquare
    * SC: 0(1)
    * */
    public static boolean checkArraySorted(int[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length-1 ; j++) {

                if(array[j]<array[i])
                {
                    return false;
                }
            }

        }

        return true;
    }

    /*Optimal tech*/

    public static boolean checkArraySortedOptimal(int[] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1])
            {
                return false;
            }
        }

        return true;
    }
}
