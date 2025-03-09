package com.example.javaeightprograms.Collections;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashToTreeSet {
    public static void main(String[] args) {

        HashSet<String> hashSet =  new HashSet<String>();

        hashSet.add("Name");
        hashSet.add("Age");
        hashSet.add("gender");
        hashSet.add("color");
        hashSet.add("Address");

        System.out.println(hashSet);

        //convert hash set to tree set

        TreeSet<String> treeSet =  new TreeSet<>(hashSet);

        for(String treeSetElement: treeSet )
        {
            System.out.println("Result set is a converted Tree Set..."+treeSetElement);
        }
    }
}
