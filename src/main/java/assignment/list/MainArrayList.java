package assignment.list;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Scanner;
class MainArrayList{ 
    public void arrayList(){
        Logger log = Logger.getLogger("hi");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();  
        int option=0;
        while(option!=6){
            log.info("\n1.Insert beginning \n2.Insert at index position \n3.Remove index element\n4.Print all elements \n5.Clear all element\n6.Exit\nEnter choice: ");
            option = sc.nextInt();
            switch(option){
                case 1:
                {
                    log.info("Enter number: ");
                    list.add(sc.nextInt());
                    break;
                }
                case 2:
                {
                    log.info("Enter position index:  ");
                    int index = sc.nextInt();
                    log.info("Enter value: ");
                    int value = sc.nextInt();
                    list.set(index, value);
                    break;
                }
                case 3:
                {
                    log.info("Enter position: ");
                    int removeindex = sc.nextInt();
                    list.remove(removeindex);
                    log.log(Level.INFO,()->""+list);
                    break;
                }
                case 4:
                {
                    if(list.isEmpty()){
                        log.info("Array list is empty.\n");
                    }else {
                        int size =list.size();
                        log.log(Level.INFO,()->""+list);
                        log.log(Level.INFO,()->""+size);
                     }
                    break;
                }
                case 5:
                {
                    list.clear();
                    log.info("All elements cleared");
                    break;
                }
                case 6:
                    break;    
                default:
                log.info("Enter a valid option");        
                }
            }
    }
}