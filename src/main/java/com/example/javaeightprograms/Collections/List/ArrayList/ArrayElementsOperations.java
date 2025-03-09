package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ArrayElementsOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C#");
        list.add("Golang");
        list.add("Kotlin");
        list.add("Python");
        list.add("Ruby");
        list.add("Scala");

        System.out.println("List of programming languages are:"+ list);
        list.add(7, "Typescript");
        boolean isRemoved = list.remove("Golang");


        System.out.println("Removing (\"Golang\")" +isRemoved);

        System.out.println("List of programming languages after removal:"+ list);

        System.out.println("Printing element at index{} :"+ list.get(2));
        list.add("Golang");
        System.out.println("Adding (\"Golang\")"+ list);

        /*
        * Using Predicates and lamda expression for arrays list
        * */

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()<3;
            }
        });

        System.out.println("Result after length selection:" + list);

        list.removeIf(s -> s.endsWith("a"));

        System.out.println("Result set for lamda expression after " +
                "length selection:" + list);


        System.out.println("print new array:"+ list.set(4,"JavaScript"));
        System.out.println("Current list:"+ list);

        System.out.println("Find the tuple in the list:");

        if(list.contains("JavaScript"))
        {

            System.out.println("Element found "+ list.indexOf("JavaScript"));
        }else
        {
            System.out.println("element not found..");
        }

        for(String alist: list)
        {
            System.out.println(alist);
        }


        for(int index = 1; index< list.size(); index++)
        {
            System.out.println(" "+list.get(index));
        }


        Collections.sort(list);
        System.out.println("List after sorted: "+ list);

        List<String> copyArrayList =  new ArrayList<>();

        copyArrayList.add("Typescript");
        copyArrayList.add("Python");
        copyArrayList.add("Java");
        copyArrayList.add("Swift");
        copyArrayList.add("Kotlin");
        copyArrayList.add("Go");

        System.out.println(copyArrayList);

        System.out.println("Copying the list2 to list 1");
        Collections.copy(copyArrayList, list);

        System.out.println(list);

        System.out.println(copyArrayList);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Print sub list of a list:");
        List<String> sublist = list.subList(3,5);
        System.out.println(sublist);

    }
}
