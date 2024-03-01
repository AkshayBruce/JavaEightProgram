package com.example.javaeightprograms.Miscellanous;

import java.util.HashSet;
import java.util.Set;

public class SetShort {

    public static void main(String[] args) {
        Set<Short> setShort = new HashSet<>();

        for(short i =0;i<100;i++)
        {
            setShort.add(i);
            setShort.remove(i-1);
        }
        System.out.println(setShort.size());
    }
}
