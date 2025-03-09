package com.example.javaeightprograms.Miscellanous;

public class NullStringConcat {

    public static void main(String[] args) {

        String message = null;

        try{
            message =message.concat("Hello World");

        }catch (NullPointerException e)
        {
            message = "Attempt  to modify null object";

        }
        finally {
            System.err.println(message);
        }
    }
}
