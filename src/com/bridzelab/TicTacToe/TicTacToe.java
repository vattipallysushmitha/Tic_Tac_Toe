package com.bridzelab.TicTacToe;
import java.util.Scanner;
public class TicTacToe
{
	
	public static char UserLetter = ' ';
	public static char ComputerLetter = ' ';


	public static void main(String[] args) {
	       System.out.println("************Welcome to TicTacToe on workshop platform*******************\"");
	       char[] board = createBoard();
	       char UserLetter = chooseLetter();
	       char ComputerLetter;
	       if(UserLetter=='X')

	           ComputerLetter='O';

	       else

	           ComputerLetter='X';

	       System.out.println("Computer Letter is::::::::::: " + ComputerLetter);
	       System.out.println("User Letter is:::::::::" + UserLetter);

	       
	       showBoard(board);
	   }

	    
	    public static void showBoard(char[] board)
	    {
	        System.out.println("  |  " + board[1] + "  |  "  + board[2] + "  |  " + board[3]);
	        System.out.println("--------------");
	        System.out.println("  |  " + board[4] + "  |  "  + board[5] + "  |  " + board[6]);
	        System.out.println("--------------");
	        System.out.println("  |  " + board[7] + "  |  "  + board[8] + "  |  " + board[9]);
	        System.out.println("--------------");
	    }


	    public static char[] createBoard() {

	        char[] board = new char[10];
	        for(int index = 0; index < board.length; index++)
	        {
	            board[index] = ' ';
	        }
	        return  board;
	    }
	    public static char chooseLetter(){
	        char symbol;
	        Scanner UserInput = new Scanner(System.in);
	        System.out.print("Enter the symbol to allow the player to choose the symbol");
	        symbol=UserInput.next().toUpperCase().charAt(0);
	        return symbol;
	    }

	}