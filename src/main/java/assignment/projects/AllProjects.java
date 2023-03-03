package assignment.projects;
import assignment.bank.BankAccount;
import assignment.calculator.CalculatorOperation;
import assignment.contact.Contacts;
import assignment.credit.Credit;
import assignment.database.Database;
import assignment.frequency.Frequency;
import assignment.graph.Coordinate;
import assignment.hash.Hashing;
import assignment.list.Main;
import assignment.shape.Shape;
import assignment.studentgpa.Student;
import assignment.studenttest.StudentTest;
import assignment.tictactoe.TicTacToe;

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
	    			BankAccount ba = new BankAccount();
	    			ba.bank();
	    			break;
	    			
	    		case 2:
	    			Shape sh = new Shape();
	    			sh.shape();
	    			break;
	    			
	    		case 3:
	    			Student sd = new Student();
	    			sd.student();
	    			break;
	    			
	    		case 4:
	    			Database db = new Database();
	    			db.database();
	    			break;
	    			
	    		case 5:
	    			Coordinate cn = new Coordinate();
	    			cn.coordinate();
	    			break;
	    			
	    		case 6:
	    			Credit cd = new Credit();
	    			cd.credit();
	    			break;
	    			
	    		case 7:
	    			StudentTest st = new StudentTest();
	    			st.students();
	    			break;
	    			
	    		case 8:
	    			Main mn = new Main();
	    			mn.list();
	    			break;
	    			
	    		case 9:
	    			Hashing hh = new Hashing();
	    			hh.hash();
	    			break;
	    			
	    		case 10:
	    			CalculatorOperation co = new CalculatorOperation();
	    			co.calculator();
	    			break;
	    			
	    		case 11:
	    			Contacts cs = new Contacts();
	    			cs.contact();
	    			break;
	    			
	    		case 12:
	    			Frequency fy = new Frequency();
	    			fy.frequency();
	    			break;
	    			
	    		case 13:
	    			TicTacToe tt = new TicTacToe();
	    			tt.tictactoe();
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
    	}
    }
}}
