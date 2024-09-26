package com.bptn.course_05_strings;
// Import Scanner
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		// Declare Scanner and variables
		Scanner scanner = new Scanner(System.in);
		
			
		// Display products and their prices
		System.out.println("Welcome to the Vending Machine");
		System.out.println("Product available");
		System.out.println("1. chips - $1.50");
		System.out.println("2. soda - $1.00");
		System.out.println("3. sweets - $0.50");
		System.out.println("4. chocolate bar - $2.50");
		System.out.println("Please select a product (1-4: ");
		
		// customerOrder, amountToPay
		int productChoice = scanner.nextInt();
		double price = 0.0;
				
		// using a switch statement to handle product selection
		
		switch (productChoice) {
		case 1:
			price = 1.50;
			break;
		case 2:
			price = 1.00;
			break;	
		case 3:
			price = 0.50;
			break;	
		case 4:
			price = 2.50;
			break;	
		default:
			System.out.println("Invalid selection. Please restart the program");
			
		}
		
		// Ask user for payment
		System.out.println ("You selected product" + productChoice + "Price: $" + price);
		System.out.println ("Please enter the amount you wish to pay");
		double payment = scanner.nextDouble();
		
		// confirm if payment is sufficient
		if  (payment >= price) {
			double change = payment - price;
			System.out.println("Dispensing product .... Thank you!");
			if (change > 0) {
				System.out.println("Your change is : $" + change);
			}
		} else {
			// Insufficient payment
			System.out.println("Insufficient payment. You need $" + (price - payment) + "more.");
			System.out.println("Would you like to (1)Retry or (2) Cancel?");
			int retryChoice = scanner.nextInt();
			if (retryChoice == 1) {
				System.out.println("Please restart the program to select a product again.");
			} else {
				System.out.println("Transaction canceled. Thank you!");
				
				
			}
		}
				
			scanner.close();	
				
		
		

	}

}
