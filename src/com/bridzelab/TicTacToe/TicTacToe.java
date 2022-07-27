package com.bridzelab.TicTacToe;
import java.util.Scanner;
public class TicTacToe
{
	
	public static char UserLetter = ' ';
	public static char ComputerLetter = ' ';


		 public static void main(String[] args)
		 {
			 
			 
		       System.out.println("************Welcome to TicTacToe on workshop platform*******************");
		       char[] board = createBoard();
		       char UserLetter = chooseLetter();
		       char ComputerLetter;
		       if(UserLetter=='X')

		           ComputerLetter='O';

		       else

		           ComputerLetter='X';

		       System.out.println(" Now the  Computer Letter is::::::: " + ComputerLetter);
		       System.out.println(" Now the User Letter is ::::::: " + UserLetter);
		 }
		 
		 

		    public static char chooseLetter(){
		        char symbol;
		        Scanner UserInput = new Scanner(System.in);
		        System.out.print("Enter the symbol to allow the player to choose the symbol");
		        symbol=UserInput.next().toUpperCase().charAt(0);
		        return symbol;
		    }


		    public static char[] createBoard() {

		        char[] board = new char[10];
		        for(int index = 0; index < board.length; index++)
		        {
		            board[index] = ' ';
		        }
		        return  board;
		    }

		}