package com.bptn.course.course_exception_handling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many elements do you want in the array?");
		int count= scanner.nextInt();
		int[] numbers = new int[count]; 
		
		System.out.println("Enter" + count + "elements for the array");
		for(int i=0; i<count; i++) {
			numbers[i]=scanner.nextInt();
		}
		System.out.println("Enter two more number for division");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
			
			
		try{
			int result = num1/num2;
			System.out.println("Element at index 10 is:" + numbers[10]);
			System.out.println("Result:" + result);
			// code that might throw an exception	
			}catch(InputMismatchException e) {
				System.out.println("Error please enter valid numbers");
			}catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("The array only contains items");
			// code to handle the exception	
			}finally {
				System.out.println("Program ended!");
			// code that will always execute	
			}

	}

}
