package com.example.javaeightprograms.Threads;

public class ThreadStartClass implements Runnable{

    public static void main(String[] args) {

        String threadname;

        ThreadStartClass threadStartClass = new ThreadStartClass();

        Thread thread =  new Thread("Thread class...");
        Thread thread1 =  new Thread("Thread one class...");

        thread.start();
        thread1.start();

        threadname = thread.getName();
        System.out.println("Thread Name: "+ threadname);

        threadname = thread1.getName();
        System.out.println("Thread Name: "+ threadname);

        //threadStartClass.start();

        System.out.println("Outside the thread..");
    }

    @Override
    public void run()
    {
        System.out.println("Thread Executed...");
    }
}
