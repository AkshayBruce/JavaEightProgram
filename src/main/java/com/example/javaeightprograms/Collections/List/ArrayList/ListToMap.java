package com.example.javaeightprograms.Collections.List.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product(101, "Laptop",15000.00),
                new Product(102,"Computer",20000.00),
                new Product(102,"WindowsComputer",26000.00),
                new Product(103,"MacComputer",25000.00)
        );
        Map<Integer, Product> mapProducts= list.stream()
                .collect(Collectors.toMap(Product::getId, Function.identity(),
                        (existing,replacement) -> existing));
        System.out.println(mapProducts);
    }
}
