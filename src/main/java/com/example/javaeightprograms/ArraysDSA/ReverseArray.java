package com.example.javaeightprograms.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int n = 5;
        int start =0;
        int end = n-1;
        int[]  array = {1,2,3,4,5};
        
        //using 3 variable
        //reverseArrayWhile(array,start,end);

//        for (int i = 0; i < n; i++) {
//
//            System.out.print(array[i]+ " ");
//        }

        
        //No 3rd variable used
       reverseArrayfor(array);

        for (int i = 0; i < n/2; i++) {

            System.out.print(array[i]+ " ");
        }

    }

    static void reverseArrayWhile(int[] array, int start, int end) {
        while(start<=end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] =temp;
            start++;
            end--;
        }
    }

    static void reverseArrayfor(int[] array) {
        int length = array.length;
        for (int i = 0; i < length/2; i++) {
            array[i] = array[i] + array[length - 1 - i];
            array[length - 1 - i] = array[i] - array[length - 1 - i];
            array[i] = array[i] - array[length - 1 - i];
        }
    }
}
