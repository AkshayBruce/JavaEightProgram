package com.example.javaeightprograms.ArraysDSA;

public class ArrayLeftRotateByK {
    public static void main(String[] args) {
        int n =7;
        int d =3;
        int[] array={1,2,3,4,5,6,7};

        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print( array[i] + " ");
        System.out.println();

        arrayLeftRotateByK(array,n,d);

        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }



    static void arrayLeftRotateByK(int[] array,int n, int d) {

        if(n == 0) return;

        d = d % n;

        if(d == 0) return;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = array[i];
        }

        for (int i = d; i < n; i++) {
            array[i - d] = array[i];
        }

        for (int i = n - d; i < n; i++) {
            array[i] = temp[i - (n - d)];
        }
    }
}
