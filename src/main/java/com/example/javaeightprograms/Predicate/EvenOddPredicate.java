package com.example.javaeightprograms.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class EvenOddPredicate {
    public static void main(String[] args) {

        //usingPartitionInPredicate();
        //usingConsumerFunction();

        usingSupplierFunction();
        testFunctions();

        biPredicate();
    }

    static void usingPartitionInPredicate()
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partitionNumber = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 !=0 ));

        System.out.println("List of even and odd  numbers:" + partitionNumber);


        List<String> word =  Arrays.asList("Cat","Cactus", "Camphor");
        List<Integer> length =  word.stream().
                map(words-> words.length())
                .collect(Collectors.toList());

        System.out.println(length + "Length of string");

    }

    static void usingConsumerFunction(){
            Consumer<String> consumer = s-> System.out.println(s);

            Consumer<List<Integer>>   listConsumer = li ->{
                    for(Integer i: li){
                        System.out.println(i+100);
                    }
            };

            listConsumer.accept(Arrays.asList(1,2,3,4,5));
    }

    static void usingSupplierFunction(){

        Supplier<String> supplier = ()-> "Akshay" ;

        System.out.println(supplier.get());
    }

    static void testFunctions(){
        Predicate<Integer> predicate = x -> x % 2 ==0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = ()->100;

        if(predicate.test(supplier.get())){
           consumer.accept(function.apply(supplier.get()));
        }
    }

    static void biPredicate(){
        BiPredicate<Integer, Integer> biPredicate =
                (x,y) ->  x % 2 == 0  && y % 2 ==0;
        System.out.println(biPredicate.test(2,4));

        BiPredicate<String, Integer> biPred =
                (str,y) -> str.length() == y;

        System.out.println(biPred.test("Sonia", 5));

        BiFunction<String, String, Integer> biFunction =
                (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hi", "Hello"));

        BiConsumer<Integer, Integer> biConsumer =
                 (x,y) -> {
                     System.out.println(x+y);
                 };

        biConsumer.accept(5,6);
    }
}
