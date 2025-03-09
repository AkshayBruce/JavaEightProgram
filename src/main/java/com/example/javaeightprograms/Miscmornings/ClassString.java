package com.example.javaeightprograms.Miscmornings;

import javax.sound.midi.Soundbank;

public class ClassString {
    public static void main(String[] args) {

     /*       A object = new B();

        System.out.println(object.s);
        object.message();


        System.out.println("B class Starts herr..");
        B objB = new B();

        System.out.println(objB.s);
        objB.message();
        objB.display();
        */

        //misc
        int Integer = 24;
        char String = 'I';

        System.out.print(Integer);
        System.out.print(String);


        Integer i =500;
        String str = i.toString();
        str+="abc";
        System.out.println(str);

        int a =10, b= 20;
        a+=(a=4);
        b=b+(b=5);

        System.out.println(a+" "+b);

        Motorcycle bike = new Motorcycle();

   }
}

class A
{
    String s = "Class A";

    void message()
    {
        System.out.println("Checking super in parent A...");
    }
}

class  B extends A
{

    String s ="Class B";

    void display()
    {
        super.message();
        System.out.println("Calling Class A string..."+ super.s);

        System.out.println("In Class B");
    }

}

class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle is created. Its a parent/Base class..");
    }
}

class Motorcycle extends Vehicle
{
    Motorcycle()
    {
        System.out.println("Motorcycle is created. Its a Child/Decendent class..");
    }

    Motorcycle(String brand)
    {
        //super();

        System.out.println("Bike brand is " + brand);
    }
}