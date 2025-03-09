package com.example.javaeightprograms.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String args[]) {
        HashMap<Integer,String> hm = new HashMap<>();


        hm.put(556,"Sonia");
        hm.put(568,"Akshay");
        hm.put(584,"Abhilash");
        hm.put(567,"ChaiRam");
        hm.put(501,"Venkytenky");

        Set set = hm.entrySet();

        Iterator iterator = set.iterator();

        while(iterator.hasNext()){

            Map.Entry m = (Map.Entry)iterator.next();
            System.out.println("Key: " +m.getKey() +"  Value: " +m.getValue());

        }
    }
}
