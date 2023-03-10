package assignment.database;

import java.sql.*;
import java.util.logging.*;

class Storing 
{
	String database;
    String username;
    String password;
    Connection con;
	Logger log = Logger.getLogger("hi");
	static Storing firstobj = null;

    private Storing(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public static Storing in(String database,String username,String password) {
    	
    	if(firstobj == null)
    	{
    		firstobj = new Storing(database,username,password);
    	}
    	return firstobj;
    }

    void connection()

    {
        try {
            con = DriverManager.getConnection(database, username, password);
            log.info("Connection established");
        } catch (Exception e) {
      
        	String msg= "Exception is" + e;
            log.info(msg);
        }
    }

    void terminate() {
    	try {
        con.close();
        log.info("Closed");
    }
    	catch(Exception e)
    	{
    		String msg= "Exception is" + e;
            log.info(msg);
    	}
    }
    
}
