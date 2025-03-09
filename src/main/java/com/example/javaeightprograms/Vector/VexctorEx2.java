package com.example.javaeightprograms.Vector;

import java.util.Arrays;
import java.util.Vector;

public class VexctorEx2 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Vector vectoradd = new Vector();

        vector.add(10);
        vector.add(20.5);
        vector.add("akshay");

        System.out.println(vector);

        vector.set(1,"soni");
        vector.add("Abhi");

        vectoradd.add("chuki");
        vectoradd.add("dinesh");


        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);

        System.out.println("Size of vector: "+vector.size());

        vector.addAll(1,vectoradd);

        System.out.println("Vector add al collection:" + vector);

//        vector.clear();
//
//        System.out.println(vector);

        Vector v = (Vector) vector.clone();
        System.out.println("Cloned vector list:"+v);

        System.out.println("contains given data: "+ vector.contains("dinesh"));
        System.out.println("contains given data: "+ vector.contains("suresh"));
    }
}
