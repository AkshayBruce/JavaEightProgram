package com.example.javaeightprograms.Patterns;

public class PatternsDesign {
    public static void main(String[] args) {

        int n=5;

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
    }

    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Pattern 1

    }

    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n)
    {
        for (int i = 1; i<=n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n)
    {
        for (int i = n; i>0; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n)
    {
        for (int i = 1; i<=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >= i; j--) {

                System.out.print(" ");
            }

            for (int j = 0; j <i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern9(int n)
    {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = n; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n)
    {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

     static void pattern11(int n)
     {
         System.out.println("Pattern -11----------------------");
         for (int i = 0; i < n; i++)
         {
             for (int j = 0; j < i; j++)
             {
                 System.out.print(" ");
             }

             for (int j = 0; j < 2 * n - (2 * i + 1); j++)
             {
                 System.out.print("*");
             }

             for (int j = 0; j < i; j++) {
                 System.out.print(" ");
             }

             System.out.println();
         }
    }

    static void pattern12(int n) {

        System.out.println("Pattern ----------------12-====");

        for (int rows = 1; rows <= 2*n-1 ; rows++) {
            int star = rows;
                if (rows>n)
                {
                    star = 2*n-rows;
                }
            for (int column = 1; column <= star; column++) System.out.print("*");
            System.out.println();
        }
        
    }

    static void pattern15(int n) {
    }

    static void pattern13(int n) {
    }

    static void pattern14(int n) {
    }



}
