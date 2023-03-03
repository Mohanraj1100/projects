package assignment.contact;

import java.util.logging.Level;
import java.util.logging.Logger;

class Linkedlists {
	Node head;
	int count =0;
	Logger log = Logger.getLogger("hi");
	Linkedlists()
	{
		head = null;
	}
	
	public void addContact(String contactname,long phonenumber,String emailaddress)
	{
		Node newnode = new Node(contactname,phonenumber,emailaddress);
		if(head==null)
		{
			head = newnode;
			count++;
		}
		else
		{
			Node temp = newnode;
			temp.next = head;
			head=temp;
			count++;
		}
	}
	public void display()
	{
		Node temp = head;
		if(temp == null)
		{
			log.info("Contact List is Empty");
		}
		else {
		while(temp!=null)
		{
			String c = "Contact Name: " + temp.contactname;
			String p = "Phone Number: " + temp.phonenumber;
			String e = "Email Address: "+ temp.emailaddress;
			log.log(Level.INFO,()->""+c +"\n"+p +"\n"+ e);
			temp=temp.next;
		}
		}
	}
	public void searchContact(String searchcontact)
    {
    	Node temp = head;
    	int mark =0;
    	if(temp == null)
    	{
    		log.info("Contacts is empty");
    	}
    	else {
    	while(temp != null)
    	{
    		if(searchcontact.equals(temp.contactname))
    		{
    			mark =1;
        		String n=  "Contact Name:"+temp.contactname;
    			String p = "Phone Number:"+temp.phonenumber;
    			String e = "Email ID:"+temp.emailaddress;
    			log.info(n);
    			log.info(p);
    			log.info(e);
    			break;
    		}

    		else
    		{
    			temp = temp.next;
    		}
    	}
    	if(mark == 0)
    	{
    		log.info("No contact found");
    	}
    	}
    }
	
	public void deleteContact(String deletecontact)
	{
		Node temp = head;
		Node prev=head;
		String str = "Deleted Contact Sucessfully";
		int mark=0;
		while(temp!=null)
		{
			if(deletecontact.equals(head.contactname))
			{
				mark=1;
				head=temp.next;
				log.info(str);
				temp=null;
			}
			else if(deletecontact.equals(temp.contactname))
			{
					mark=1;
					log.info(str);
					prev.next=prev.next.next;
					break;
				
			}
			else
			{
				prev = temp;
				temp=temp.next;	
			}
			
		}
		if(mark == 0)
		{
			log.info("No Contact found ");
		}
		
	}
	
    	
}