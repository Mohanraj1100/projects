package assignment.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class BankOperation {
	
	String holdername;
    long accno;
    static float balance = 0;
    static int detect;
//    Scanner inputobj = new Scanner(System.in);
    static Logger log=Logger.getLogger("hi");
    static List<Account> list = new ArrayList<Account>();
	private BankOperation(String name,long accno,float balance){
		Account ac = new Account(name, accno, balance);
		int occur=0;
		for(  int index=0; index< list.size(); index++)
		{
			if(list.get(index).accno == accno)
			{
				occur=1;
				log.info("Account Number already exists");
				break;
				
			}
			
		}
		if(occur==0)
		{
			list.add(ac);
			log.info("Account Created Sucessfully");
		}
	}
	public static BankOperation recent(String name,long accno,float balance)
	{
			return new BankOperation(name,accno,balance);
	}
	
	public static boolean old(Long oldaccno)
	{
		int occur=0;
		for(  detect=0; detect< list.size(); detect++)
		{
			if(list.get(detect).accno == oldaccno)
			{
				occur=1;
				log.log(Level.INFO,()->"\nAccount Holder Name ----->   "+list.get(detect).name+"\nAccount Number----->   "+list.get(detect).accno);
				break;
				
			}
			
		}
		if(occur==0)
		{
			log.info("Incorrect Credentials or Create New Account");
			return false;
		}
		return true;
	}
	public static void deposit(float amount) {      
        list.get(detect).balance = list.get(detect).balance + amount;
        log.info("Deposited Sucessfully");
    }

    public static void withDraw(float amount) {
    	if(amount <=25000)
    	{
    		if (amount > list.get(detect).balance) {
    			log.info("Thers is no required amount");
    		} else {
    			list.get(detect).balance  = list.get(detect).balance  - amount;
    			log.info("Amount Withdrawl Sucessfully");
    		}
    	}
    	else
    	{
    		log.info("Excess amount withdrawl cannot be done");
    	}
    }

    public static void balanceAmt() {
        log.log(Level.INFO,()->"Balance ----->   " + list.get(detect).balance );
    }

}
