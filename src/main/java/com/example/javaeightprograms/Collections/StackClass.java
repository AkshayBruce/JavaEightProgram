package com.example.javaeightprograms.Collections;

import java.util.Stack;

public class StackClass {
    public static void main(String args[]) {

        Stack<String> stack=new Stack<String>();

            stack.push("Akshay");
        stack.push("soni");
        stack.push("abhi");
        stack.push("Venky");
        stack.push("tenky");
        stack.pop();
        stack.push("Java");
        stack.push("Ruby");
        stack.push("aws");
        stack.pop();

        System.out.println("List of elements in stack:" + stack);

    }
}
