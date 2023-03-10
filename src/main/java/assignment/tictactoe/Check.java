package assignment.tictactoe;

import java.util.logging.Logger;

abstract class Check
{
	static Logger l = Logger.getLogger("hi");
	static int size = XoBoard.size;
	char [][]xo;
	Check(char[][] xo)
	{
		this.xo = xo;
	}
	public static void check(int play1,int play2)
	{
		if(play1 == size)
		{
			l.info("Player 1 wins");
			TicTacToe.i = size*size+1;
		}
		if(play2 == size)
		{
			l.info("Player 2 wins");			
			TicTacToe.i = size*size+1;
		}
	}
	public abstract void condition();
}
