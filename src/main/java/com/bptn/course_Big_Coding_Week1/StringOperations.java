package com.bptn.course_Big_Coding_Week1;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Start the do-while loop for the menu
        do {
            // Display the menu
            System.out.println("/--- String Menu ---/");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.println("Enter the option:");
            option = scanner.nextInt();  // Take the option as input
            scanner.nextLine();  // Consume the newline character

            // Switch case to handle different options
            switch (option) {
                case 1:
                    // Palindrome Check
                    System.out.println("Palindrome Check");
                    System.out.print("Enter a string: ");
                    String palindromeStr = scanner.nextLine();
                    if (isPalindrome(palindromeStr)) {
                        System.out.println(palindromeStr + " is a palindrome.");
                    } else {
                        System.out.println(palindromeStr + " is not a palindrome.");
                    }
                    break;

                case 2:
                    // Reverse a String
                    System.out.println("Reverse a String");
                    System.out.print("Enter a string to reverse: ");
                    String strToReverse = scanner.nextLine();
                    System.out.println("Reversed String: " + reverseString(strToReverse));
                    break;

                case 3:
                    // Concatenate two Strings
                    System.out.println("Concatenate two Strings");
                    System.out.print("Enter First string: ");
                    String firstStr = scanner.nextLine();
                    System.out.print("Enter Second string: ");
                    String secondStr = scanner.nextLine();
                    System.out.println(firstStr + secondStr);  // Concatenate the strings
                    break;

                case 4:
                    // String Comparison
                    System.out.println("String Comparison");
                    System.out.print("Enter First string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter Second string: ");
                    String str2 = scanner.nextLine();
                    if (str1.equals(str2)) {
                        System.out.println("The entered strings are equal.");
                    } else {
                        System.out.println("The entered strings are not equal.");
                    }
                    break;

                case 5:
                    // Calculate the Length of String
                    System.out.println("Length of a String");
                    System.out.print("Enter a string: ");
                    String strToMeasure = scanner.nextLine();
                    System.out.println("The length of the entered string is: " + strToMeasure.length());
                    break;

                default:
                    // Invalid choice handling
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }

            System.out.println();  // Print a new line for better readability

        } while (option >= 1 && option <= 5);  // Continue loop until an invalid option is selected

        scanner.close();  // Close the scanner to prevent resource leaks
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);  // Reverses the string
        return str.equals(reversed);  // Check if original equals reversed
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();  // Reverse the string using StringBuilder
    }
}
