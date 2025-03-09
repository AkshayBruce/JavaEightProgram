package com.example.javaeightprograms.ArraysDSA;

public class ArrayConcept {

    public static void main(String[] args) {

        int number[] ;
        number = new int[5];

        //int number[] = new int[5];
        //int number[rows][columns] = new int[][];
        //int[] numbers = {1,2,3,4,5,6,7,8,9};

//        System.out.println("Size of the array:"+ number.length);
//        for (int rows = 0; rows < number.length; rows++) {
//
//            System.out.println(number[rows]);
//        }
//
//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//
//        int temp;
//        for (int rows = 0; rows < numbers.length; rows++) {
//            for (int columns = 0; columns < rows ; columns++) {
//
//                temp= numbers[rows] + numbers[columns];
//                System.out.println(temp);
//               }
//
//            System.out.println("Loop break");
//        }


        int[][] Two2D = new int[3][3];

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        Two2D[0][0] = 1;
        Two2D[0][1] = 2;
        Two2D[0][2] = 3;
        Two2D[1][0] = 4;
        Two2D[1][1] = 5;
        Two2D[1][2] = 6;
        Two2D[2][0] = 7;
        Two2D[2][1] = 8;
        Two2D[2][2] = 9;

        for (int rows = 0; rows < Two2D.length; rows++) {
            for (int columns = 0; columns < Two2D[rows].length; columns++) {

                System.out.print(Two2D[rows][columns] +" ");
            }
            System.out.println();
        }

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {

                System.out.print(matrix[rows][columns] +"  ");
            }
            System.out.println();
        }

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Array created with elements: " + java.util.Arrays.toString(myArray));
    }
}
