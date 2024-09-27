package com.bptn.course_Big_Coding_Week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// declare two variables
		int number;
		double firstNumber;
		double secondNumber;
		double result;
		// users choice
		int choice;
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find a reciprocal");
		
		//accept users choice
		choice = scanner.nextInt();
		
		if(choice == 1 || choice == 2 || choice == 3 || choice == 4) { // conditional statements
		System.out.print("Enter the first number: ");
		firstNumber = scanner.nextDouble();
		
		System.out.print("Enter the second number: ");
		secondNumber = scanner.nextDouble();if( choice == 1) {
			result = firstNumber + secondNumber;	
			System.out.print("The sum of the numbers " + firstNumber + " and " + secondNumber + " is = "+result);
		}
		else if( choice == 2) {
			result = firstNumber + secondNumber;
			System.out.print("The subtraction of the numbers " + firstNumber + " and " + secondNumber + " is = "+result);
		}
		else if( choice == 3) {
			result = firstNumber * secondNumber;
			System.out.print("The multiplication of the numbers " + firstNumber + " and " + secondNumber + " is = "+result);
		}
		else if( choice == 4) {
			result = firstNumber / secondNumber;
			System.out.print("The division of the numbers " + firstNumber + " and " + secondNumber + " is = "+result);
		}
		
			
		}
		else {
			System.out.print("Enter Number: ");
			number = scanner.nextInt();
			
			if(choice == 5) {
				result = number * number;
				System.out.print(" The square of a number " + number + " is = " + result);
			}
			else if(choice == 6) {
				result = Math.sqrt(number);
				System.out.print(" The squareroot of a number " + number + " is = " + result);
			}
			else if(choice == 7) {
				result = 1/number;
				System.out.print(" The reciprocal of a number " + number + " is = " + result);
			}
				
		}
		
		
		
		scanner.close();
		}
		
	}
		
		

	


