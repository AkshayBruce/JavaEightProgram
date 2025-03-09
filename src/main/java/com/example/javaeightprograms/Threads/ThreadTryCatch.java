package com.example.javaeightprograms.Threads;

public class ThreadTryCatch{
    public static void main(String[] args) {

        try {
            String str = "includehelp";

            String s = null;

            System.out.println("Length of string: "+ s.length());


            System.out.println("Char: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        } catch(Exception e)
        {
            System.out.println(e.getStackTrace());
        }



        System.out.println("Program finished");

        Mythread thread = new Mythread();

        thread.start();
        thread.interrupt();
    }
}

class Mythread extends Thread {


    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.err.println("Exception: "+ e.getMessage());
        }
    }

}
