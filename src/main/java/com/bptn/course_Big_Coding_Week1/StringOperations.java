package com.bptn.course_Big_Coding_Week1;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		String userInput1;
		String userInput2;
		boolean tryAgain = true;
		String doAgain = "N" ;
		
		do {
		
		System.out.println("/…String Menu…/");
		System.out.println("Press 1 for Palindrome Check");
		System.out.println("Press 2 to reverse a String");
		System.out.println("Press 3 to Concatenate two Strings");
		System.out.println("Press 4 for String Comparison");
		System.out.println("Press 5 to Calculate the Length of String");
		
		choice = scanner.nextInt();
		
		 if(choice == 1) {
			System.out.println("Palindrome check");
			System.out.println("Enter a string");
			userInput1 = scanner.next();
			// palindrome check
			String reversed = new StringBuilder(userInput1) . reverse().toString();
			System.out.println(reversed);
			
		}
		else if(choice == 2) {
			System.out.println("Reverse the string");
			System.out.println("Enter a string");
			userInput1 = scanner.next();
			String reversed = new StringBuilder(userInput1) . reverse().toString();
			System.out.println(reversed);
			
		}
		else if(choice == 3) {
			System.out.println("Concatenate the string");
			System.out.println("Enter the first string");
			userInput1 = scanner.next();
			
			System.out.println("Enter the second string");
			userInput2 = scanner.next();
			
		}
		else if(choice == 4) {
			System.out.println("String comparizon");
			System.out.println("Enter the first string");
			userInput1 = scanner.next();
			
			System.out.println("Enter the second string");
			userInput2 = scanner.next();
		}
		else if(choice == 5) {
			System.out.println("Length of a string");
			System.out.println("Enter a string");
			userInput1 = scanner.next();
			
			System.out.println("Enter the second string");
			userInput2 = scanner.next();
		 
		}
			
	}while (tryAgain);	
		scanner.close();	
	
		

	}

}
