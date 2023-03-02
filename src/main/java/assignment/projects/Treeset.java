package assignment.projects;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

class Treeset {

	void treeSet() {

		TreeSet<Integer> t = new TreeSet<Integer>();
		Logger log = Logger.getLogger("hi");
		t.add(23);
		t.add(56);
		t.add(45);
		t.add(1);
		t.add(10);
		log.log(Level.INFO,()->"Values are"+t);
		log.log(Level.INFO,()->"Size of map"+t.size());
		t.clear();
		log.log(Level.INFO,()->"Values after cleared"+t);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(0);
		TreeSet<Integer> t1 = new TreeSet<Integer>(al);
		log.log(Level.INFO,()->"After get elements from ArrayList"+t1);
		

	}

}
