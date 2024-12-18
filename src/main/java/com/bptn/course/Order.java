package com.bptn.course;

class Order {

	private Customer customer;
	private CartItem[] items;
	private double totalAmount;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.items = customer.getCart().showProductsInCart();
		this.totalAmount = customer.getCart().getTotalPrice();
	}
	
	public void placeOrder() {
		System.out.println("Order placed successfully for " + customer.getCustomerName());
		System.out.println("Order SUmmary:");
		for(CartItem item:items) {
			System.out.println("\t " +item.getproduct().getProductName() + " - " + item.getCartQuantity() );	
		}
		System.out.println("Total Amount: $" +totalAmount);
	}
}
