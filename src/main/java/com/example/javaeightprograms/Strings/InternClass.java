package com.example.javaeightprograms.Strings;

public class InternClass {
    public static void main(String[] args) {

        String firstPerson = "Akshay";
        String secondPerson = "Soni";
        String thirdPerson =  new String("Akshay");

        String fourthPerson =  new String("Soni").intern();

        boolean fifthPerson = (firstPerson == fourthPerson);

        System.out.println(firstPerson == thirdPerson);    // without intern method
        System.out.println(secondPerson == fourthPerson); // with intern method
        System.out.println(firstPerson == thirdPerson.intern());
        System.out.println(fifthPerson);

    }
}
