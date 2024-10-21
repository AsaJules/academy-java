package com.bptn.course_33_Challenge_WordleLike;

public class HiddenWord {

	/** Declare any fields (instance variables) **/
	private String hiddenWord;

	/** Declare a constructor */
	public HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	/** Write the getHint method */
	public String getHint(String guess) {
		StringBuilder hint = new StringBuilder();

		// Iterate through each character in the guess
		for (int i = 0; i < guess.length(); i++) {
			char guessedChar = guess.charAt(i);
			char hiddenChar = hiddenWord.charAt(i);

			// If the guessed character is in the correct position
			if (guessedChar == hiddenChar) {
				hint.append(guessedChar);
			}
			// If the guessed character is in the word but the wrong position
			else if (hiddenWord.indexOf(guessedChar) != -1) {
				hint.append("+");
			}
			// If the guessed character is not in the hidden word
			else {
				hint.append("*");
			}
		}
		return hint.toString();
	}

	/** This is a main method for testing the class */
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
		System.out.println(puzzle.getHint("HELLO") + " it should print H****");
		System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
		System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
		System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

	} // end of main

}
