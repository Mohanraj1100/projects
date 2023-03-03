package assignment.database;

import java.util.*;
import java.util.logging.*;

public class Database {

	public void database() {
        String database;
        String username;
        String password;
        Logger log = Logger.getLogger("hi");
        try {
        Scanner sc = new Scanner(System.in);
        log.info("Enter database name");
        database = sc.next();
        log.info("Enter Username");
        username = sc.next();
        log.info("Enter Password ");
        password = sc.next();
        Storing obj1 = Storing.in(database,username,password);
        obj1.connection();
        obj1.terminate();
        }
        catch(Exception e)
        {
        	String s = ""+e;
        	log.info(s);
        }
    }
}
