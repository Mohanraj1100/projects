package assignment.projects;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Coordinate 
{
	 public static void coordinate(){
	        Scanner sc = new Scanner(System.in);
		 Logger log = Logger.getLogger("hi");
		 try {
	        log.info("Enter x-Coordonate");
	        Float x = sc.nextFloat();
	        log.info("Enter y-coordinate");
	        Float y = sc.nextFloat();

	        Coordinates in = new Coordinates(x, y);
	        Coordinates is = in.co();
	        log.log(Level.INFO,()->""+is.equals());
		 }
		 catch(Exception e)
		 {
			 String s = ""+e;
			 log.info(s);
		 }
}
}
