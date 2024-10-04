package com.bptn.course.course_MobileDataPlanSelector;
import java.util.Scanner;

public class MobileDataPlanSelector {

	public static void main(String[] args) {
		// Display available data plans
		System.out.println("Select a mobile data plan");
		System.out.println("1. Basic Plan - 2gb - $10");
		System.out.println("2. Standard Plan - 5gb - $20");
		System.out.println("3. Premium Plan - 10gb - $30");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the plan number (1-3): ");
		
		// Read user input
		int planNumber = scanner.nextInt();
		String selectedPlan = "";
		int price = 0;
		
		// Determine the selected price plan
		switch (planNumber) {
		case 1:
			selectedPlan = "Basic Plan - 2gb";
			price = 10;
			break;
		case 2:	
			selectedPlan = "Standard Plan - 5gb";
			price = 20;
			break;
		case 3:
			selectedPlan = "Premium Plan - 10gb";
			price = 30;
			break;
		default:
			System.out.println("Error: Invalid plan selection. Please choose a valid plan");
						
			System.out.println("You selected: " + selectedPlan);
			System.out.println("Price: $" + price);
			
		}
		
		scanner.close();

	}

}
