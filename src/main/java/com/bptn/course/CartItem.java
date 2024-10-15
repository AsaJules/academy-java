package com.bptn.course;

class CartItem {
	
	private Product product;
	private int cartQuantity;
	
	public CartItem(Product product, int quantity) {
		
			
		if(cartQuantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
		
		this.product = product;
		this.cartQuantity = quantity;
	}
	
    // Getters / Accessors
	 public Product getproduct() {
	        return this.product;
	 }
	 
	 public int getCartQuantity() {
		 return this.cartQuantity;
	 }
	 
	 public double getTotalPrice() {
		 return product.getProductPrice() * this.cartQuantity;
	 }
}
