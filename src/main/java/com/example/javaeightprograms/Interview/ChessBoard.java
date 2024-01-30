package com.example.javaeightprograms.Interview;

public class ChessBoard {


    public static void main(String[] args) {
        System.out.println(getSquareColor(3,'e'));
        System.out.println(getSquareColor(4,'e'));
        System.out.println(getSquareColor(5,'e'));
    }


    public static String getSquareColor(int row ,char column){

        //row-1-8
        //column- a-h
         int val = column - 'a' +1;
         boolean isWhite = (val+row) %2 != 0;

         String position = ""+column+row;

        return "is "+ (isWhite ? "white" : "black");
    }

}
