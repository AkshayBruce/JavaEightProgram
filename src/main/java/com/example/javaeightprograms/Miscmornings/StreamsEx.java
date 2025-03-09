package com.example.javaeightprograms.Miscmornings;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsEx implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println(name + "  i am from inteface....");
    }

    public static void main(String[] args) throws ScriptException {

        List<String> list = Arrays.asList("Akshay", "Soni", "Cherry");

        list.forEach(item-> System.out.println(item));

        StreamsEx ex = new StreamsEx();

        ex.sayHello("Akshay");

        List<String> listnames = list.stream().filter(listitem -> listitem.endsWith("y")).collect(Collectors.toList());

        System.out.println("filter names.."+listnames);

        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(value -> System.out.println(value));

        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println(nextWeek);

        list.forEach(System.out::print);

        System.out.println();
        list.parallelStream().forEach(System.out::println);

        String result =  list.stream().collect(Collectors.joining(", "));
        System.out.println(result);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        if (engine != null) {
            try {
                engine.eval("print('Hello, World')");
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Script engine could not be initialized.");
        }

    }
}


@FunctionalInterface

interface Greeting
{
    void sayHello(String name);
}