package assignment.tictactoe;

import java.util.Scanner;
import java.util.logging.Logger;
public class TicTacToe 
{
	private TicTacToe(){}
	      static int i;

		public static void tictactoe()
    {
    	Logger l = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
    	XoBoard xb = new XoBoard();
    	int position;
    	int size=xb.size;
    	xb.printArray();
    	l.info("Player 1  x");
    	l.info("Player 2  o");
    	i=0;
    	while(i<size*size)
    	{
    		if(i%2==0)
    		{
    			l.info("First Player Enter the position");
    			position = sc.nextInt();
    			int val = xb.insert(position,'x');
    			if(val == 1) {
    				i--;
    			}
    			xb.printArray();
    			xb.checkConditon();
    		}
    		else
    		{
    			l.info("Second Player Enter the position");
    			position = sc.nextInt();
    			int val=xb.insert(position,'o');
    			if(val == 1) {
    				i--;
    			}
    			else
    			{
    			xb.printArray();
    			xb.checkConditon();
    			}
    		}
    		i++;
    		if(i==9)
    		{
    			l.info("Match has been Drawn");
    		}
    		
    	}   	
    }

	
}
