package assignment.projects;

import java.util.*;
import java.util.logging.*;
class Shape
{
    public static void shape() {
    	int choice;
        Logger log = Logger.getLogger("hi");
        Scanner inputobj = new Scanner(System.in);
        log.info("Which shape you want to calculate from below\n1.Rectangle\n2.Triangle\n3.Circle");
        choice = inputobj.nextInt();
        ShapeCalculation sc = new ShapeCalculation(choice);
        sc.perimeterIs();
        sc.areaIs();
    }
}