package com.example.javaeightprograms.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraysPractice {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("Yello");
        list.add("Red");
        list.add("Green");
        System.out.println("list:"+ list);
        list.remove("Red");
        list.add(list.get(1));
        System.out.println("list:"+ list);
        list.add("Beige");
        list.add("Yello");
        list.add("Red");
        list.add("Green");
        list.add(String.valueOf(list.size()));
        System.out.println("list:"+ list);
//        for(String element: list){
//            System.out.println(element);
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        list.add(2,"Violet");

        System.out.println("list:"+ list.get(2));
        list.set(2,"Purple");
        System.out.println("update the list at a specific position list:"+ list);
        list.remove(2);
        System.out.println("Remove element At the position :"+ list);
        Collections.sort(list);
      System.out.println("Sorting elements:"+ list);

        Collections.reverse(list);
        System.out.println("Reverse Sorting elements:"+ list);

        System.out.println("Reverse order Sorting elements:"+ Collections.reverseOrder());

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");
        System.out.println("list2:"+ list2);
        //Collections.copy(list2, list);
        Collections.shuffle(list);
        System.out.println("Shuffle elements 1:"+ list);
        Collections.shuffle(list2);
        System.out.println("Shuffle elements 2:"+ list2);
        list = list.subList(0,4);
        System.out.println("sublist of list:"+ list);
        ArrayList<String> list3 = new ArrayList<>();

//        for (String e: list) {
//            list3.add(list2.contains(e) ? "Yes" : "No");
//            System.out.println(list3);
//        }

        list3.addAll(list);
        list3.addAll(list2);
        System.out.println("list3:"+ list3);
        System.out.println("clone copy of list:"+ list3.clone() );

        int list34 = list3.size();
//
//        for (int i = 0; i < list34; i++) {
//            System.out.println(list3.get(i));
//
//        }

//        Iterator p = list3.iterator();
//        while(p.hasNext()){
//            System.out.println(p.next());
//        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Earth");
        ll.add("Sun");
        System.out.println("linkedList:"+ ll);
        ll.offer("water");
        ll.offerFirst("moon");
        ll.offerLast("Jupiter");
        System.out.println("linkedList:"+ ll);
        ll.addFirst("bluemoon");
        ll.addLast("goldSun");
        System.out.println("linkedList:"+ ll);
        String first=ll.getFirst();
        String last=ll.getLast();

        System.out.println("linkedList:"+"first " +first +" last "+ last);

        System.out.println("Remove last:"+ll.removeLast()+ "Remove first:" + ll.removeFirst());
        System.out.println(ll);
    }
}


