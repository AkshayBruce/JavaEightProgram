package com.example.javaeightprograms.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("Science");
        list.add("English");
        list.add("mathematics");
        list.add("Social");
        System.out.println("Data in arraylist:" + list) ;

        list.add(0,"Telugu");
        System.out.println("After adding new course;" + list );
    }
}
