package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductList {

    public static Map  createFilteredList(List<Product> listA) {

        Map result = listA.stream().collect(
                        Collectors.groupingBy(Product::getCategory,
                                Collectors.mapping(Product::getName, Collectors.toSet())
                        )
                );

        return result;
    }

    public Map getProducts() {
        List<Product> listA = new ArrayList<>();

        listA.add(new Product("apple" , "fruit"));
        listA.add(new Product("coca", "drink"));
        listA.add(new Product("orange" , "fruit"));
        listA.add(new Product("pepsi", "drink"));
        listA.add(new Product("banana" , "fruit"));

        long startTime = System.nanoTime();
        Map test = createFilteredList(listA);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println(duration);

        return test;
    }

    public Map setProducts(Product[] data) {
        List<Product> listA = Arrays.asList(data);

        long startTime = System.nanoTime();
        Map test = createFilteredList(listA);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println(duration);

        return test;
    }

}