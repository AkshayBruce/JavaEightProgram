package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {
        String students[] = {"Akshay", "Jonu","Abhliash","Chai Ram", "Venky"};

        //java 8
        System.out.println("Arrays inputs: "+ Arrays.toString(students));

        /* Java 7
        * String students[] = {"Akshay", "Jonu","Abhliash","Chai Ram", "Venky"};
        *
        * for(int i=0; i<students.length;i++)
        * {
        *      result += students[i];
        *      if(i< students.length-1)
        *      {
        *           result +=", ";
        *      }
        * }result +="]";
        *
        * System.out.println(result);
        * */


        List<String> studentList = new ArrayList<>(Arrays.asList(students));

        System.out.println("Collection of elements : "+ studentList);

    }
}
