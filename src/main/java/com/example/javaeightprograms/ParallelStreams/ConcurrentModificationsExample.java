package com.example.javaeightprograms.ParallelStreams;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationsExample{
    public static void main(String[] args) {
       // List<Integer> list = new ArrayList<>();
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.parallelStream()
                .forEach(number -> {
                    System.out.println("Current:" + number);
                    list.add(number * 10); // Simulate concurrent Modification
                });
    }
}
