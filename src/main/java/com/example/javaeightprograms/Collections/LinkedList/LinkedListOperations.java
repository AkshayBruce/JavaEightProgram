package com.example.javaeightprograms.Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("SQL");
        linkedList.add("ORACLE");
        linkedList.add("MYSQL");
        linkedList.add("MONGODB");

        System.out.println(linkedList);

        for (String elements: linkedList)
        {
            System.out.println(elements);
        }

        Iterator<String> listIterator = linkedList.listIterator(2);

        System.out.println("Elements Printed after 1 record:");
        while (listIterator.hasNext())
        {

            System.out.println(listIterator.next());
        }

        Iterator<String> reverseIterator = linkedList.descendingIterator();

        System.out.println("Elements printed reverse order.."+ "\\\\\\\\\\\\\\\\\\\\\\");
        while (reverseIterator.hasNext())
        {
            System.out.println(reverseIterator.next());
        }

        System.out.println("Insert element at middle of linked list....");

        linkedList.add(2, "DynamoDB");
        System.out.println(linkedList);

        linkedList.addFirst("Cassandra");
        linkedList.addLast("PostgreSql");
        System.out.println("Linked list after the adding elements at first and last...");

        System.out.println(linkedList);

        linkedList.offerFirst("GCP");
        linkedList.offerLast("AWS");

        System.out.println(linkedList);

        List<String> toNewList = new LinkedList<>();

        toNewList.add("Java");
        toNewList.add("C#");

        linkedList.addAll(8,toNewList);

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.getLast());


        for (String ll: linkedList)
        {
            System.out.println(ll +"        "+"is at position of elements in the list: "+ linkedList.indexOf(ll));
        }

        Collections.swap(linkedList,0,1);
        System.out.println(linkedList);

        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
