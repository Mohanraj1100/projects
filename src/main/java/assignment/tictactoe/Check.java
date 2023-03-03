package assignment.tictactoe;

import java.util.logging.Logger;

abstract class Check
{
	Logger l = Logger.getLogger("hi");
	int size;
	char [][]xo;
	Check(int size,char[][] xo)
	{
		this.size = size;
		this.xo = xo;
	}
	public void check(int play1,int play2)
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

