package com.example.javaeightprograms.MisEvenings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxArray {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter positive integers:");
//        int input = scan.nextInt();
//
//        List<Integer> array = new ArrayList<>();
//
//        System.out.println("Enter the elements to find of min and max of the array:");
//        for (int i = 0; i < input; i++) {
//            int arraylist = scan.nextInt();
//            array.add(arraylist);
//
//        }
//        System.out.println("List of elemenets in array:" + array);
//
//        minMaxmethod(array);
//    }
//
//    public static void minMaxmethod(List<Integer> array) {
//        int min=0, max=0;
//
//        Collections.sort(array);
//
//        for (int i = 0; i < array.size()-1; i++) {
//
//            min += array.get(i);
//            max += array.get(array.size()-1-i);
//        }
//
//        System.out.println(min+" "+max);
//    }
//}
//

//
// class Main {

    public static void main(String[] args) {
//        // Sample array
//        int[] array = {5, 2, 9, 1, 6};
//
//        // Find minimum and maximum sums
//        int[] minMaxSums = findMinMaxSum(array);
//
//        // Print the results
//        System.out.println("Minimum sum: " + minMaxSums[0]);
//        System.out.println("Maximum sum: " + minMaxSums[1]);
//    }
//
//    // Function to find minimum and maximum sum of an array
//    public static int[] findMinMaxSum(int[] array) {
//        int minSum = Integer.MAX_VALUE;
//        int maxSum = Integer.MIN_VALUE;
//        int currentSum = 0;
//
//        // Iterate through the array to calculate the sum
//        for (int num : array) {
//            currentSum += num;
//            minSum = Math.min(minSum, currentSum);
//            maxSum = Math.max(maxSum, currentSum);
//        }
//
//        return new int[]{minSum, maxSum};
//    }

    int[] array = {5, 2, 9, 1, 6};

    // Find minimum and maximum sums
    int[] minMaxSums = findMinMaxSum(array);

    // Print the results
        System.out.println("Minimum sum: " + minMaxSums[0]);
        System.out.println("Maximum sum: " + minMaxSums[1]);
}

// Function to find minimum and maximum sum of an array
public static int[] findMinMaxSum(int[] array) {
    int minSum = Integer.MAX_VALUE;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    // Iterate through the array to calculate the sum
    for (int num : array) {
        currentSum += num;
        if (currentSum < minSum) {
            minSum = currentSum;
        }
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    }

    return new int[]{minSum, maxSum};
}
}

