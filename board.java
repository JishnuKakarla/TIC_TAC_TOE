package com.techlab.tictactoe;

public class board {
	
	public static String turn = mark.X.toString();
	
	public void printBoard(String[] board) {
		
		System.out.println("┌-----------┐");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("└-----------┘");
		
		if(turn == mark.O.toString())
			turn = mark.X.toString();
		else
			turn = mark.O.toString();
		
		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
	}
}
