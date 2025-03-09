package com.example.javaeightprograms.ArraysDSA;

public class Maxwealth2D {
    public static void main(String[] args) {
        int[][] account = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println( maxwealth(account));

    }

    static int maxwealth(int[][] accounts)
    {

        int wealth = Integer.MIN_VALUE;

        for (int[] eachperson : accounts) {

            int asset = 0;
            for (int col: eachperson ) {
                asset += col;
            }
            if(asset > wealth)
            {
                wealth = asset;
            }
        }
        return wealth;
    }
}
