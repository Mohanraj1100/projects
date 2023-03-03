package assignment.studentgpa;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class StudentLevel{
	String studentname;
    char gradelevel;
    float gpa;
    float updatedgpa;
    char response;
    Scanner inputobj = new Scanner(System.in);
    Logger log = Logger.getLogger("hi");
    StudentLevel(String studentname,char gradelevel,float gpa)
    {
    	this.studentname = studentname;
    	this.gradelevel = gradelevel;
    	this.gpa = gpa;
    }
    
    public void update() {
        log.info("Do you need to update your GPA\nFor update type y or else n");
        response = inputobj.next().charAt(0);
        switch(response) {
        case 'y':
        	try {
            log.info("Enter updated GPA");
            updatedgpa = inputobj.nextFloat();
        	}
        	catch(InputMismatchException e)
        	{
        		String msg = "Exception"+e;
        		log.info(msg);
        	}
            if ((gradelevel == 'A') && (updatedgpa >= 9) && (updatedgpa <= 10)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'B') && (updatedgpa >= 7) && (updatedgpa <= 8)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'C') && (updatedgpa >= 5) && (updatedgpa <= 6)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'D') && (updatedgpa >= 3) && (updatedgpa <= 4)) {
                gpa = updatedgpa;
            } else if ((gradelevel == 'E') && (updatedgpa >= 1) && (updatedgpa <= 2)) {
                gpa = updatedgpa;
            } else {
                log.info("Cannot be updated");
            }
            break;
        case 'n':
        log.info("Ok ");
	break;
			
		default:
			log.info("Enter Valid Choice");
			break;
    }
}

public void result() {
    log.log(Level.INFO,()-> studentname +" has a GPA Level of "+gpa);
}
	
}
