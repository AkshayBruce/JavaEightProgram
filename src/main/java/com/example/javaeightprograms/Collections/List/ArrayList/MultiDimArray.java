package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {

    public static void main(String[] args) {
        /*
        *   1 2 3
        *   4 5 6
        *   7 8 9
        * */



        Scanner scan = new Scanner(System.in);

        //int arr = scan.nextInt();

//         arr[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//System.out.println(arr[1][2]);

        int[][] arr = new int[3][3];

        System.out.println(arr.length);

        //Input

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scan.nextInt();

            }
        }

        //output
        //level1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                 System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //level2
//        for(int row =0; row< arr.length; row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
