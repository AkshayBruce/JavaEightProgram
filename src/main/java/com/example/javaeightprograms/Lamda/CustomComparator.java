package com.example.javaeightprograms.Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {

        Student student = new Student(1,"Akshay");
        Student student1 = new Student(2,"venkatesh");
        Student student2 = new Student(3,"Harish");

        List<Student> list = new ArrayList<>();

        list.add(student);
        list.add(student1);
        list.add(student2);
        Collections.sort(list, (a,b) -> b.id - a.id);
        System.out.println(list);

    }


}

class Student{
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + ": " + this.name;
    }
}