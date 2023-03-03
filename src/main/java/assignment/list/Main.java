package assignment.list;

import java.util.Scanner;
import java.util.logging.Logger;
public class Main {

	public void list() {
		Logger logger = Logger.getLogger("hi");
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(choice != 3)
		{
			logger.info("Choose Option:\n1.ArrayList\n2.LinkedList\n3.Exit");
			choice = sc.nextInt();
			if(choice == 1)
			{
				MainArrayList alist = new MainArrayList();
				alist.arrayList();
			}
			else if(choice == 2)
			{
				MainLinkedList hset = new MainLinkedList();
				hset.linkedList();
			}
			else if(choice == 3)
			{
				break;
			}
			else
			{
				logger.info("Invalid Option");
			}
		}

	}

}
