package com.example.javaeightprograms.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfElements {
    public static void main(String args[]){
        //List<Integer> list = Arrays.asList(21,22,29,30);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        /**
         //       Map<Department, Optional<Employee>> highestPaidByDept = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        Map<Department, Long> employeeCountByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
*/
        System.out.println(nameLengths.stream().count());

    }
}
