package assignment.projects;

import java.util.Scanner;
import java.util.logging.*;
public class Credit 
{
	public static void credit() {
        Scanner si = new Scanner(System.in);
        Logger log=Logger.getLogger("hi");
        try {
        log.info("Enter cardholder name");
        String cardholder = si.nextLine();
        log.info("Enter cardnumber");
        Long cardnumber = si.nextLong();
        log.info("Enter card's expiry daate");
        String expirydate = si.next();

        Long validcardno = 987654321l;

        CreditCard obj1 = new CreditCard(cardholder, cardnumber, expirydate);
        CreditCard obj2 = obj1.co();
        log.log(Level.INFO,()->" "+obj2.equals(validcardno));
        obj2.display();
        }
        catch(Exception e)
        {
        	String s = " "+e;
        	log.info(s);
        }
    }

}

