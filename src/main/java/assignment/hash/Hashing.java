package assignment.hash;

import java.util.Scanner;
import java.util.logging.Logger;

public class Hashing {

	public void hash() {
		Scanner sc = new Scanner(System.in);
		Logger log = Logger.getLogger("hi");
		int choice;
		log.info("Enter your choice\n1.HashMap\n2.HashSet\n3.TreeSet\n4.Exit");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			Hashmap hm = new Hashmap();
			hm.hashMap();
			break;
			
		case 2:
			Hashset hs = new Hashset();
			hs.hashSet();
			break;
			
		case 3:
			Treeset ts = new Treeset();
			ts.treeSet();
			break;
			
		case 4:
			System.exit(0);
			break;
			
		default:
			log.info("Invalid choice");
			break;
			
		}
		

	}

}
