package com.example.javaeightprograms.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

//        map.put("Akshay",1);
//        map.put("sonia",2);
//        map.put("Abhi",3);
//
//        //System.out.println(map);
//        for (Map.Entry<String, Integer> entry : map.entrySet())
//        {
//           if (entry.getValue() % 2 == 0)
//           { map.remove(entry.getKey()); }
//        }
//        System.out.println(map);

        hashMapExample();
    }

    static void hashMapExample()
    {
        Map<Integer, String> mapping =  new HashMap<>();
        Map<Integer, String> secondmap =  new HashMap<>();


        mapping.put(1, "Akshay");
        mapping.put(2, "Sonia");
        mapping.put(3, "Abhilash");
        System.out.println(mapping);

        secondmap.put(4, "Venky");
        secondmap.put(5, "chai ram");

        System.out.println(secondmap);

        mapping.putAll(secondmap);
        System.out.println(mapping);

        //clone map
        //HashMap<Integer, String> clonemap = new HashMap<>();

        //clonemap = (HashMap)mapping.
               // HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
        //new_hash_map = (HashMap)mapping.clone();
        System.out.println("contains value map: " + mapping.containsValue("Akshay"));

        System.out.println("contains Key map: " + mapping.containsKey(4));

        System.out.println("Collection of values:"+ mapping.values());
        System.out.println(mapping.size());
        for(Map.Entry entry : mapping.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        secondmap.clear();
        System.out.println(secondmap);
        System.out.println(secondmap.isEmpty());
    }

}
