package com.example.javaeightprograms.Leetcode;

import java.util.Arrays;

public class Arraypermutation {

    public static void main(String[] args) {

        int[] nums = {5,0,1,2,3,4};

        int[] number = buildArray(nums);
        System.out.println(Arrays.toString(number));
    }

    public static int[] buildArray(int[] nums)
    {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i <n ; i++) {
            ans[i] = nums[nums[i]];
            }

        return ans;
    }
}
