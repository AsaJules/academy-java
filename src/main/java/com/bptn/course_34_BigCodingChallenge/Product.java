package com.bptn.course_34_BigCodingChallenge;

import java.util.ArrayList;
import java.util.List;

public class Product {

	// Create your instance variables
	private int id;
	private String name;
	private double price;

	// Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id; // Assign the id to the instance variable
		this.name = name; // Assign the name to the instance variable
		this.price = price; // Assign the price to the instance variable
	}

	// Create a static method "countProducts"
	public static long countProducts(List<Product> productsList) {
		// Filter products based on the price and get the count of products
		return productsList.stream().filter(product -> product.price < 30000) // Filter products based on price
																				// condition
				.count(); // Count the number of products that satisfy the condition
	}

	public static void main(String[] args) {
		// Create a list of products
		List<Product> productsList = new ArrayList<Product>();

		// Add products to the list
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		// Call "countProducts" method and hold return type in "count" variable
		long count = countProducts(productsList);

		// Print the count of products whose price is less than 30000
		System.out.println("Number of products with price less than 30000: " + count);
	}
}
/*
 * Summary: This code defines a 'Product' class with three attributes: id, name,
 * and price. It uses a constructor to initialize these values. The main logic
 * is in the static method 'countProducts', which filters and counts products
 * with a price less than 30,000 using Java Streams. The 'filter' method with a
 * lambda expression checks each product's price, and the 'count' method
 * computes how many products meet the criteria. Understanding streams and
 * lambda expressions was new. Using them simplified the logic but initially
 * required some practice to get familiar with how they work. I’ll make sure to
 * use streams and lambdas more often in the future for filtering and processing
 * collections.
 */