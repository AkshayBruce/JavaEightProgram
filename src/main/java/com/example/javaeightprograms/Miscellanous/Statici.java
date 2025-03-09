package com.example.javaeightprograms.Miscellanous;

public class Statici {
    private static int i =0;

    public static void main(String[] args) {
        Statici s = new Statici();
        s.i++;


        Statici a = new Statici();
        a.i++;


        Statici t = new Statici();
        t.i++;


        System.out.println(s.i);
        System.out.println(a.i);
        System.out.println(t.i);
    }
}
