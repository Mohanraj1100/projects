package assignment.list;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class MainArrayList {
		public void arrayList(){
        int limit = 0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("hi");
       
	        while (limit == 0) {
	        	try {
		            logger.info("\n1.Add \n2.Delete \n3.Display \n4.Size \n5.exit \nEnter Your Choice : ");
		            int ch = sc.nextInt();
		            switch (ch) {
		
		                case 1:
		                {
		                    logger.info(" Enter the element to add in the array : ");
		                    int n = sc.nextInt();
		                    arrlist.add(n);
		                    break;
		                }
		
		                case 2:
		                {
		                    if (arrlist.isEmpty()) {
		                        logger.info(" Array empty");
		                    } 
		                    else {
		                        logger.info("Enter the array element yo need  : ");
		                        int del = sc.nextInt();
		                        if (arrlist.contains(del)) {
		                            for (int i = 0; i < arrlist.size(); i++) {
		                                if (arrlist.get(i) == del) {
		                                    arrlist.remove(i);
		                                    logger.info("Element Deleted!");
		                                    break;
		                                }
		                            }
		                        } 
		                        else {
		                            logger.info("The element you entered is not in the array");
		                        }
		                    }
		                    break;
		                }
		
		                case 3:
		                {
		                	if(arrlist.isEmpty())
		                	{
		                		logger.info("Empty");
		                	}
		                	else {
		                		
		                		logger.log(Level.INFO,()->"The element in the array are : " + arrlist);
		                	}
		                    break;
		                }
		                case 4:
		                {
		                	logger.info(""+arrlist.size());
		                	break;
		                }	
		                case 5:
		                {
		                    limit = 1;
		                    break;
		                }
		                default:
		                {
		                    logger.info("Invalid choice");
		                    break;
		                }
		            }
	        	}catch(Exception e) {
	        		e.printStackTrace();
	        		sc.nextLine();
	        	}
	
	        }
    }
}