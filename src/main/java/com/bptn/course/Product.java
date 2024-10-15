package com.bptn.course;

class Product {

	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	public Product(String productId, String productName, double productPrice, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	// Getters / Accessors	
	public String getProductId() {
		return this.productId;
	}
	public String getProductName() {
		return this.productName;
	}
	public double getProductPrice() {
		return this.productPrice;
	}
	public int getProductQuantity() {
		return this.productQuantity;	
	}
	
	public void reduceStock(int quantity) {
		if(quantity <= productQuantity) {
			productQuantity -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}
	
}
