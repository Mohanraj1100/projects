package assignment.projects;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class MainLinkedList
{
    public void linkedList()
    {
    	Scanner sc = new Scanner(System.in);
    	Logger logger = Logger.getLogger("hi");
    	LinkedList obj = new LinkedList();
    	int op = 0;
    	try {
    	while(op != 5)
    	{
    		logger.info("Choose Option:\n1.Add\n2.Remove\n3.Search\n4.Print\n5.exit");
    		op = sc.nextInt();
    		switch(op)
    		{
    			case 1:
    			{
    	    		logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		obj.addElement(name);
    				break;
    			}
    			case 2:
    			{
    				logger.info("Enter Name:");
    				String remname = sc.next();
    				obj.removeElement(remname);
    				break;
    				
    			}
    			case 3:
    			{
    				logger.info("Enter Name to search::");
    				String search = sc.next();
    				obj.search(search);
    				break;
    			}
    			case 4:
    			{
    				obj.print();
    				break;
    			}
    			case 5:
    			{
    				op = 5;
    				break;
    			}
    			default:
    			{
    				logger.info("Invalid Option");
    				break;
    			}
    		}
    	}
    	}
    	catch(InputMismatchException e)
		{
			logger.log(Level.INFO,()->""+e);
			sc.nextLine();
		}
    }
}
