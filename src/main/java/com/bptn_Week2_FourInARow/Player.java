package com.bptn_Week2_FourInARow;
import java.util.Scanner;

/**
    The player class is concerned with descibing a player and things that relate to it. It keeps track of the name of a player, the order of the player in relation to other players in the game, and the move the player may want to make (which is just as simple as the user picking which column of the board they want their token to be dropped in). This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on the specification we've received.
*/
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

	// create getter methods
    public String getName() {
        return name;
    }

public int getPlayerNumber(){
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


