package com.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class InterviewApplication {
	ProductList p = new ProductList();
	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@GetMapping("/products")
	public List Products() {
		return p.getProducts();
	}

	@PostMapping(value = "/products")
	public List postBody(@RequestBody Product[] product) {
		return p.setProducts(product);
	}
}