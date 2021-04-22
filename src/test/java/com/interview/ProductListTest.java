package com.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductListTest {
    private final ProductList productList = new ProductList();

    @Test
    public void getProd() {

        List testResult = productList.getProducts();

        assertNotNull (testResult);
    }

    @Test
    public void setProd() {
        Product[] listExample = {
                new Product("apple" , "fruit"),
                new Product("coca", "drink"),
                new Product("orange" , "fruit"),
                new Product("pepsi", "drink"),
                new Product("banana" , "fruit")
        };

        List testResult = productList.setProducts(listExample);

        assertNotNull (testResult);
    }
}
