package com.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class InterviewApplication {
	ProductList p = new ProductList();
	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@GetMapping("/products")
	public Map Products() {
		return p.getProducts();
	}

	@PostMapping(value = "/products")
	public Map postBody(@RequestBody Product[] product) {
		return p.setProducts(product);
	}
}