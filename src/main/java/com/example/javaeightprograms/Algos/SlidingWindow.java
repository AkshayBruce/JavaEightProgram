package com.example.javaeightprograms.Algos;

public class SlidingWindow {
        public static int maxSumSubarray(int[] arr, int k) {
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i <= arr.length - k; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += arr[j];
                }
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum;
        }

        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            //System.out.println("Maximum Sum of Subarray bruteforce: " + maxSumSubarray(arr, k));
            System.out.println("Maximum Sum of Subarray TwoPointer: " + maxSumSubarrayTwoPointer(arr, k));

        }

    public static int maxSumSubarrayTwoPointer(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // Add new element, remove old element
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
