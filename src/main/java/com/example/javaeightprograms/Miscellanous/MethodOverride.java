package com.example.javaeightprograms.Miscellanous;

public class MethodOverride {
    public static void main(String args[])
    {
        Parent parent =new Child();
        parent.print();
    }

}
class Parent
{
    public void print()
    {
        System.out.println("Hello from Parent.");
    }
}

class Child extends Parent
{

    public void print()
    {
        System.out.println("Hello from child.");
    }
}
