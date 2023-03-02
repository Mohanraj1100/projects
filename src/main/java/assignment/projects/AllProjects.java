package assignment.projects;

import java.util.Scanner;
import java.util.logging.Logger;
public class AllProjects 
{
    public static void main( String[] args )
    {
    	Logger log = Logger.getLogger("hi");
    	boolean inp = true;
    	while(inp)
    	{
    		try {
    			Scanner input = new Scanner(System.in);
    			log.info("Enter your choice for project\n1.BankAccount\n2.Shape\n3.Student GPA\n4.Database\n5.Graph Co-ordinates\n6.CreditCard\n7.StudentTest\n8.List Operations\n9.Hashing\n10.Calculator\n11.Contacts\n12.Frequency\n13.TicTacToe\n14.Exit");
    			int choice = input.nextInt();
	    	switch(choice)
	    	{
	    		case 1:
	    			BankAccount.bank();
	    			break;
	    			
	    		case 2:
	    			Shape.shape();
	    			break;
	    			
	    		case 3:
	    			Student.student();
	    			break;
	    			
	    		case 4:
	    			Database.database();
	    			break;
	    			
	    		case 5:
	    			Coordinate.coordinate();
	    			break;
	    			
	    		case 6:
	    			Credit.credit();
	    			break;
	    			
	    		case 7:
	    			StudentTest.students();
	    			break;
	    			
	    		case 8:
	    			Main.list();
	    			break;
	    			
	    		case 9:
	    			Hashing.hash();
	    			break;
	    			
	    		case 10:
	    			CalculatorOperation.calculator();
	    			break;
	    			
	    		case 11:
	    			Contacts.contact();
	    			break;
	    			
	    		case 12:
	    			Frequency.frequency();
	    			break;
	    			
	    		case 13:
	    			TicTacToe.tictactoe();
	    			break;
	    		
	    		case 14:
	    			log.info("Thank You");
	    			inp = false;
	    			break;
	    			
	    		default:
	    			log.info("Enter Valid Choice");
	    			break;
	    		
	    		
    	}
    }
    	
    	catch(Exception e)
    	{
    		String f = ""+e;
    		log.info(f);
//    		inp = false;
    	}
//    	
    }
}}
