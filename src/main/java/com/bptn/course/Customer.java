package com.bptn.course;

class Customer {
	
	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	public Customer(String customerID, String customerName, String customerEmail) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();

}
	// Getters / Accessors	
	public String getCustomerName() {
		return this.customerName;
	}
	public ShoppingCart getCart() {
		return this.cart;
	}
	public void checkout() {
		System.out.println("Processing order for name" + this.getCustomerName() + "...");
	}
}	
