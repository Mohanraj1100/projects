package assignment.contact;

class Node {
	String contactname;
	long phonenumber;
	String emailaddress;
	Node next;
	Node(String contactname,long phonenumber,String emailaddress)
	{
		this.contactname=contactname;
		this.phonenumber=phonenumber;
		this.emailaddress=emailaddress;
		next=null;
	}

}
