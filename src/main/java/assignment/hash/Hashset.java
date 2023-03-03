package assignment.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.*;

class Hashset {

	void hashSet() {
		HashSet<Integer> hst = new HashSet<Integer>();
		Logger log=Logger.getLogger("hi");
		hst.add(5);
		hst.add(500);
		hst.add(52);
		hst.add(51);
		hst.add(5);
		log.log(Level.INFO,()->"Elements are"+hst);
		hst.remove(51);
		log.log(Level.INFO,()->"After removing the elements are"+hst);
		log.log(Level.INFO,()->"Size of Hashset is "+hst.size()); 
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("how");
		ll.add("are");
		ll.add("you");
		ll.add("?");
		log.log(Level.INFO,()->"Values in LinkedList"+ll);
		
		HashSet<String> hs1 = new HashSet<String>(ll);
		log.log(Level.INFO,()->"Values after adding linkedlist elements"+hs1);
		hs1.clear();
		log.log(Level.INFO,()->"Values after cleared"+hs1);
		log.log(Level.INFO,()->"Size after cleared  "+hs1.size());
		
		
		

	}

}