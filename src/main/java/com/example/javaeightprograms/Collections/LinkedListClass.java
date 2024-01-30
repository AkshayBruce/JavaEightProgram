package com.example.javaeightprograms.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args){
        List<String> list = new LinkedList<String>();

        list.add("Science");
        list.add("English");
        list.add("mathematics");
        list.add("Social");

        list.add(0,"Telugu");
        System.out.println("Linkled list elments:" + list) ;

        Iterator<String> i = list.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
