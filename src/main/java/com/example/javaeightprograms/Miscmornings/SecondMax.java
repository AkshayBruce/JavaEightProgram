package com.example.javaeightprograms.Miscmornings;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int arr[] = new int[]{n1,n2,n3};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }

    }
}
