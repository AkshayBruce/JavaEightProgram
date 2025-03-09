package com.example.javaeightprograms.Examples;

public class StaticClass {
    public static void  main(String[] args)
    {
        Parent p = new Child();
        Child c = new Child();
        Parent.printNotification();
        Child.printNotification();

    }
}

class Parent
{
    static void printNotification()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    static void printNotification()
    {
        System.out.println("Child");
    }
}
