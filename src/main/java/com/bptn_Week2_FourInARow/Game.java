package com.bptn_Week2_FourInARow;

	import java.util.Scanner;

	public class Game {

	    private Player[] players;
	    private Board board;
	    private static Scanner scanner = new Scanner(System.in);

	    public Game() {
	        // Let's default it two players for now. Later, you can improve upon this to allow the game creator to choose how many players are involved.
	       this.players = new Player[2]; // Initialize players array for two players
	        this.board = new Board(); // Initialize the board
	    }

	    public void setUpGame() {
	        System.out.println("Enter player 1's name: ");
	        players[0] = new Player(scanner.nextLine(), "1");

	        String playerTwoName = null;
	        do {
	        System.out.println("Enter player 2's name: ");
	        String playerTwoName1 = scanner.nextLine();
	        /** add logic to prevent a user from giving a second name that's equal to the first. Allow the user to try as long as the names are not different.*/

	         //wrap the code in here with a conditional block that enables the check described above. 
	        if (playerTwoName1.equals(players[0].getName())) {
	                System.out.println("Error! Both Players cannot have the same name.");
	            }
	        } while (playerTwoName.equals(players[0].getName()));
	        
	        players[1] = new Player(playerTwoName, "2");

	        // set up the board using the appropriate method
	        // print the board the using appropriate method
	        board.initialize(); // Assume there's an initialize method in the Board class
	        board.printBoard(); // Assume there's a print method in the Board class to display the board
	    }

	    public void printWinner(Player player) {
	        System.out.println(player.getName() + " is the winner");
	    }

	    public void playerTurn(Player currentPlayer) {
	        String col = currentPlayer.makeMove();
	        do {
	            col = currentPlayer.makeMove();
	       } while (!board.addToken(col, currentPlayer.getPlayerNumber())); {
	           
	        // print board
	        board.printBoard();{
	    }

	    public void play() {
	        boolean noWinner = true;}
	        this.setUpGame();
	        int currentPlayerIndex = 0;

	        while (noWinner) {
	           // Check if the board is full
	            if (board.isFull()) { // Assume isFull() checks if the board is full
	                System.out.println("Board is now full. Game Ends.");
	                return;
	            }

	            Player currentPlayer = players[currentPlayerIndex];
	            // Override default tostring for Player class
	            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
	            playerTurn(currentPlayer);

	            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
	                printWinner(currentPlayer);
	                noWinner = false;
	            } else {
	                currentPlayerIndex = (currentPlayerIndex + 1) % players.length;// reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
	            }
	        }
	    }

	}


}
