package com.example.javaeightprograms.Lamda;

import java.util.*;

public class lamdaComparator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (a,b) -> b -a);
        System.out.println(list);

        TreeSet<Integer> treeSet = new TreeSet<>();
        // data in order, hashset not in order
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(111);
        System.out.println("Before sorting: " + treeSet );
        TreeSet<Integer> treeSet1 = new TreeSet<>
                ((a,b) -> b - a);
        treeSet1.add(1);
        treeSet1.add(11);
        treeSet1.add(111);
        System.out.println("After sorting using comparator: " + treeSet1 );

        Map<Integer, String> map =  new HashMap<>();
        map.put(1,"z");
        map.put(2,"y");
        map.put(3,"x");
        System.out.println("Before sorting HashMap: " + map );

        Map<Integer, String> map1 = new TreeMap<>((a,b) -> b - a);
        map.put(1,"z");
        map.put(2,"y");
        map.put(3,"x");
        System.out.println("After sorting using comparator TreeeMap: " + map1 );

    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
