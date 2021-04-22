package com.interview;

public class Product {
    public String name;
    public String category ;

    public Product(String name, String category ) {
        this.name = name;
        this.category  = category ;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}