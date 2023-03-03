package assignment.studenttest;

import java.util.*;
import java.util.logging.*;
import java.util.Comparator;

public class StudentTest {

	public void students() {
		
		Logger log = Logger.getLogger("hi");
		int i = 0;
		Students ob1 = new Students("mohan",18,9.18);
		Students ob2 = new Students("kawin",19,8.06);
		Students ob3 = new Students("gopi",17,7.99);
		Students ob4 = new Students("kl",17,10.76);
		
		ArrayList <Students>list  =  new ArrayList<Students>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		while(i<list.size()) {
			log.info(list.get(i).getName() + list.get(i).getAge() + list.get(i).getGpa() );
			i++;
		}
		log.info("List After GPA sorted ");
		
		i=0;
		Collections.sort(list, new Comparator<Students>()
				{
					public int compare(Students o1, Students o2) {
						if(o1.getGpa()<	o2.getGpa())
						{
							return 1;
						}
						else if(o2.getGpa()== o1.getGpa())
						{
							return 0;
						}
						else {
							return -1;
						}
					}
			
				});
		while(i<list.size()) {
			log.info(list.get(i).getName() + list.get(i).getAge() + list.get(i).getGpa() );
			i++;
		}
		
	}

}
