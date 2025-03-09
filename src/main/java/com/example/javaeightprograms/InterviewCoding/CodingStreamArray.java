package com.example.javaeightprograms.InterviewCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CodingStreamArray {

    public static void main(String[] args) {

        Integer[] array = {1,0,1,1,0,1,0,0,0,1,1};

        //using Stream API
        System.out.println(Arrays.stream(array).sorted().collect(Collectors.toList()));

        //using loop
        replaceZeroswithOne(array);

        replaceOnesAndZeros(array);
    }

    static void replaceZeroswithOne(Integer[] array)
    {
        int left =0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] == 0)
            {
                int temp = array[i];
                array[i] =  array[left];
                array[left] = temp;

                left++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void replaceOnesAndZeros(Integer[] array)
    {
        int left =0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] == 1)
            {
                int temp  = array[i];
                array[i] = left;
                left =  temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
