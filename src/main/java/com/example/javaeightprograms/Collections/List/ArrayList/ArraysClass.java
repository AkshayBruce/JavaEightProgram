package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] number;
        number = new int[0];

        String[] word;
        word = new String[0];

//        System.out.println(number);
//        System.out.println(word);

        int[] nums={3,4,5,12};

        System.out.println(Arrays.toString(nums));
        change(nums);

        System.out.println(Arrays.toString(nums));
    }

     static void change(int[] nums) {
        nums[0] = 99;
    }


}
