package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductList {

    private static List getCategories(List<Product> prods) {
        List<String> d = new ArrayList();
        for (Product p : prods) {
            boolean ans = d.contains(p.getCategory());
            if (!ans) {
                d.add(p.getCategory());
            }
        }
        return d;
    }

    public static List  createFilteredList(List<Product> listA) {
        List<FilteredProductList> result = new ArrayList();
        List<String> categories = getCategories(listA);
        for (String c: categories) {
            List<String> d = new ArrayList();
            for (Product p : listA) {
                if (p.getCategory().equals(c)) {
                    d.add(p.getName());
                }
            }
            result.add(new FilteredProductList( c, d));
        }

        return result;
    }

    public List getProducts() {
        List<Product> listA = new ArrayList<>();

        listA.add(new Product("apple" , "fruit"));
        listA.add(new Product("coca", "drink"));
        listA.add(new Product("orange" , "fruit"));
        listA.add(new Product("pepsi", "drink"));
        listA.add(new Product("banana" , "fruit"));

        long startTime = System.nanoTime();
        List test = createFilteredList(listA);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println(duration);

        return test;
    }

    public List setProducts(Product[] data) {
        List<Product> listA = Arrays.asList(data);

        long startTime = System.nanoTime();
        List test = createFilteredList(listA);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println(duration);

        return test;
    }

}