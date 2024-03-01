package com.example.javaeightprograms.Patterns;

public class Pattero {
    public static void main(String[] args) {

        Pattero.pattern2();

        int n=5;
        for (int i = 0; i < 5; i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2()
    {
        int n=5;
        for (int rows = 1; rows <= n ; rows++) {

            for (int columns = n; columns >rows ; columns--) {
                System.out.print("* ");
            }

            for (int backRows = 1; backRows <=n ; backRows++) {
                {
                    for (int backColumns = n; backColumns > backRows ; backColumns--) {

                        System.out.print("* ");
                    }

                }
            }
            System.out.println();
        }
    }
}
