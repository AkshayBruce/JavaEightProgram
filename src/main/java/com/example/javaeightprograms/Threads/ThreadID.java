package com.example.javaeightprograms.Threads;

public class ThreadID implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadID());

        Thread thread1 = new Thread(new ThreadID());
        Thread thread2 =  new Thread(new ThreadID());
        thread.start();
        thread1.start();

        //thread1;
        thread2.start();

        //Thread.join();

        thread.setPriority(3);
        thread1.setPriority(2);
        thread2.setPriority(1);

        thread.setName("Getting set name from thread...");
        thread1.setName("Getting set name from thread1...");
        thread2.setName("Getting set name from thread2...");

        System.out.println(" "+ thread.getName());
        System.out.println(" "+ thread1.getName());
        System.out.println(" "+ thread2.getName());


        System.out.println("Get Thread priority thread: "+ thread.getPriority());
        System.out.println("Get Thread priority thread1: "+ thread1.getPriority());
        System.out.println("Get Thread priority thread2: "+ thread2.getPriority());


        System.out.println("Check the thread is alive:" + thread.currentThread().isAlive());

        System.out.println("Check the thread is alive:" + thread1.currentThread().isAlive());

        System.out.println("Check the thread is alive:" + thread2.currentThread().isAlive());

        System.out.println("Check the thread is alive:" + Thread.currentThread());
    }

    @Override
    public void run() {
            try {

                System.out.println("Running the thread " + Thread.currentThread().getId());
                Thread.sleep(100);

                System.out.println("Executing thread..." + Thread.currentThread());

                System.out.println("Executing thread..." + Thread.currentThread().getState());


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


}

