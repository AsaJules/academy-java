package com.bptn.course;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double billAmount = 0.0;
		double[] priceList = {15.99, 8.99, 9.99, 6.99};
		
		System.out.println("Welcome to the menu!");
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. Pizza - $");
		System.out.println("2. Burger - $8.99");
		System.out.println("3. Pasta - $9.99");
		System.out.println("4. Salad - $6.99");
		System.out.println("5. Exit");
		System.out.println("5. Exit");
		
		
		int choice = scanner.nextInt();
	
			
		switch (choice) {
		case 1: System.out.println("You ordered Pizza");
		billAmount += priceList[0];
				break;
		case 2: System.out.println("You ordered Burger");
		billAmount += priceList[0];
				break;
		case 3: System.out.println("You ordered Pasta");
		billAmount += priceList[0];
				break;
		case 4: System.out.println("You ordered Salad");
		billAmount += priceList[0];
				break;
		case 5: System.out.println("Thank you for stopping by: " +billAmount);
		billAmount += priceList[0];
				break;
		default:System.out.println("Invalid Choice");
		
		// Allow multiple selections
		// Calculate total price for the order
		// While exiting, show the total price
		


		scanner.close();

	}
}
