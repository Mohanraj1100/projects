package assignment.hash;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Hashmap 
{
    void hashMap()
    {
        HashMap<String,String> has = new HashMap<String,String>();
        Logger l = Logger.getLogger("hi");
        has.put("Vaigai EXP", "06:30");
        has.put("Pandian EXP","07:00");
        has.put("Chennai EXP","19:00");
        l.log(Level.INFO,()-> "Entries are"+ has);
        HashMap<String,String> has2 = new HashMap<String,String>();
        has2.putAll(has);
        l.log(Level.INFO,()->"Values after adding another hashmap values"+has2);
        l.log(Level.INFO,()->"Size is "+has2.size());
        Set<Map.Entry<String, String>> s = has.entrySet();
        l.log(Level.INFO,()->"Print the keys"+has.keySet());
        l.log(Level.INFO,()->"Print the values"+has.values());
        has2.clear();
        l.log(Level.INFO,()->"Values after cleared"+has2);
        l.log(Level.INFO,()->"Set is"+s);
        
        
        
    }
}
