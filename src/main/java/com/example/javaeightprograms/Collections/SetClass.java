package com.example.javaeightprograms.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetClass {
    public static void main(String args[]) {
        //HashSet<String> set = new HashSet<String>();
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Paul");
        set.add("Ram");
        set.add("Aaron");
        set.add("Leo");
        set.add("Becky");
        set.add("Paul");
        set.add("Paul");
        set.add("Ram");
        set.add("Aaron");
        set.add("Leo");
        set.add("Becky");
        set.add("Paul");

        Iterator<String> i =set.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());

        }
    }
}
