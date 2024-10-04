package com.bptn.course.course_Week2_FourInARow;

import java.util.Scanner;

public class Player {

	private String name;
	private int playerNumber;
	// Add other instance variable(s)

	public void Player1(String name, int i) {
		this.name = name;
		int playerNumber2 = this.playerNumber;
		// complete constructor
	}

	public Player(String name1, int i) {
		// TODO Auto-generated constructor stub
	}

	public Player(String nextLine, String string) {
		// TODO Auto-generated constructor stub
	}

	// create getter methods
	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public String makeMove() {
		Scanner scanner = new Scanner(System.in); // Scanner to take input
		System.out.print(name + ", enter the column where you want to drop your token: ");
		String column = scanner.nextLine(); // receive user input
		return column;
	}

	public String toString() {
		return ("Player " + playerNumber + " is " + name);
	}
}
