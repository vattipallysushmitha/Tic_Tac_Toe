package com.bridzelab.TicTacToe;

public class TicTacToe
{
	char[] board = new char[10];
		public void Board()
		{
			
			for(int i=1; i<board.length; i++)
			{
				board[i]= '';
				
			}
		}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TicTacToe obj = new TicTacToe();
		obj.Board();
		System.out.println("*********adding the Tic Tac Toe Game on Board***********");
	}

}
