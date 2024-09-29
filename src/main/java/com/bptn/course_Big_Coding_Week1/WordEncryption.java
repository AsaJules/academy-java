package com.bptn.course_Big_Coding_Week1;

import java.util.Scanner;

public class WordEncryption {

		public static String encryptWord(String word) {
		
		Scanner scanner = new Scanner(System.in);
		
		// to store the encrypted word
		StringBuilder encrypted = new StringBuilder();
		// loop through each character of the input word
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			// if the character is a lowercase letter (between a and z)
			if (ch>= 'a' && ch <= 'z') {
				// shift the character by 1, wrapping around from z to a if needed
				encrypted.append((char) ((ch - 'a' + 1) % 26 + 'a'));
			}
			// if the character is a uppercase letter (between A and Z)
			else if (ch>= 'A' && ch <= 'Z') {
							// shift the character by 1, wrapping around from Z to A if needed
							encrypted.append((char) ((ch - 'A' + 1) % 26 + 'A'));
			}
			// If the character is not a letter, leave it unchanged
			else {
				encrypted.append(ch);
			}
		}
		return encrypted.toString(); // return the encrypted word
		
			}
		public static void main(String[] args) {
			// scanner to take input from user
			Scanner scanner = new Scanner(System.in);
			// prompt user to enter a word
			System.out.print("Enter a word: ");
			String word = scanner.nextLine(); // Read the word input
			// call encryptWord method to encrypt the input word
			String encryptedWord = encryptWord(word);
			// print the encrypted word
			System.out.println("Encrypted word: " + encryptedWord);
			
		// close scanner to avoid leak
			scanner.close();
		}
}




		

	

