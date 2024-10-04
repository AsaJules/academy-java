package com.bptn.course.course_Big_Coding_Week1;

import java.util.Scanner;

public class PluralForm {
	
	// pluralize the given word based on the number
	public static String pluralize(String amt, String word) {
		int amount = Integer.parseInt(amt); // convert string amt to an integer
		if (amount == 1) { // confirm word should be in a singular form
			return amt + " " + word; // return as is
		}
	// case for words ending in y but not ay, ey, oy, uy
		if (word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("ey") || word.endsWith("oy") || word.endsWith("uy"))) {
			return amt + " " + word.substring(0, word.length() - 1) + "ies"; // change y to ies
		}
		// default case: add an s to pluralize most words
		return amt + word + "s";
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // create scanner to take input from the user
	
	// prompt user for amount and the singular noun
	System.out.print("Enter a non-negative integer: ");
	String amt = scanner.nextLine(); // read string input
	
	System.out.print("Enter a singular noun: ");
	String word = scanner.next(); // read singular input
	
	String result = pluralize(amt, word);
	System.out.println(result); // print result
	
	scanner.close();
	
	
	
		

	}

}
