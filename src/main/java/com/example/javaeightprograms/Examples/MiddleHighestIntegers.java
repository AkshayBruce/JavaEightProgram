package com.example.javaeightprograms.Examples;

public class MiddleHighestIntegers {
    public static void main(String[] args) {

        System.out.println(getSeatType(10));
        System.out.println(getSeatType(1));
        System.out.println(getSeatType(17));

    }

    public static String getSeatType(Integer seatNumber)
    {
        Integer numberOfRows = (seatNumber -1)/6;
        Integer rowPosition = (seatNumber -1)%6;

        if(rowPosition == 0 || rowPosition==5){
            return "Hurray!!! you got Window Seat..";}

        else if(rowPosition == 1 || rowPosition == 4){
        return "You designated seat is middle aisle..";

    }else {
        return "You designated seat is Aisle..";}
    }
}
