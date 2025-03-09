package com.example.javaeightprograms.Miscellanous;

import java.util.*;

public class HashMapPhoneBook {

    public static void main(String[] args) {

        Map<String, Long> customerPhoneBook = new HashMap<String,Long>(100, 0.9f);

        customerPhoneBook.put("Akshay",6125129527L);
        customerPhoneBook.put("Sonia", 9522459372L);
        customerPhoneBook.put("Abhilash", 5053767548L);


        Set<Map.Entry<String, Long>> phoneBook = customerPhoneBook.entrySet();

        System.out.println("---------: Contacts in my Phone List :----------");

        for(Map.Entry<String,Long> phoneEntry : phoneBook)
        {
            System.out.println("Name: " + phoneEntry.getKey() + " Number:" + phoneEntry.getValue());
        }
            System.out.println("------------------------------------------------");

            System.out.println("No of Contacts in my Phone:" + phoneBook.size());
        //System.out.println("Vikram's Contact number : " + phoneBook.getClass());
//            System.out.println("Sonia's Contact Number:" + phoneBook.stream()
//                    .map(s -> s.getValue())
//                    .equals("sonia"));
//
//        System.out.println("Add Venky:" + phoneBook.add("Venky"));
        }
    }


