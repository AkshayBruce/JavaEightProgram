package com.example.javaeightprograms.Miscellanous;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 4, 4, 5,4,5,4,6,9,9,7,9};
        int newLength = removeDuplicates(sortedArray);

        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(sortedArray[k] + " ");
        }
    }
}
