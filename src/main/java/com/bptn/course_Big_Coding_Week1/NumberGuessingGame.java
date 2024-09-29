package com.bptn.course_Big_Coding_Week1;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int targetNumber = 23; // The target number is set to 23 as per the problem statement.
		        int guess = 0;

		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("Guess a number between 1 and 100:");

		        // Start a loop that will continue until the user guesses the correct number
		        while (guess != targetNumber) {
		            // Read the user's guess
		            guess = scanner.nextInt();

		            // Validate if the guess is within the valid range (1 to 100)
		            if (guess < 1 || guess > 100) {
		                System.out.println("Please enter a number between 1 and 100.");
		            } else if (guess < targetNumber) {
		                // If the guess is too low, provide feedback
		                System.out.println("Too low! Try again.");
		            } else if (guess > targetNumber) {
		                // If the guess is too high, provide feedback
		                System.out.println("Too high! Try again.");
		            } else {
		                // If the guess is correct, congratulate the user and break the loop
		                System.out.println("Congratulations! You guessed the number correctly!");
		            }
		        }

		        scanner.close(); // Close the scanner to prevent resource leaks
		    }
		

		

	}


