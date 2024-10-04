package com.bptn.course.course_Week2_FourInARow;

public class TestClass {
	
	public static void main(String[] args) {
        Player player1 = new Player("Alice", 1);
        Player player2 = new Player("Bob", 2);
        
        // Test player info and moves
        System.out.println(player1);
        System.out.println(player2);

        String player1Move = player1.makeMove();
        System.out.println("Player 1 chose column: " + player1Move);

        String player2Move = player2.makeMove();
        System.out.println("Player 2 chose column: " + player2Move);
    }
}
// This will be the class with a main method that creates a game instance and so on. We'll get to this much later. 



