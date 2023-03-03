package assignment.frequency;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Frequency 
{

	public void frequency()
	{
		Logger logger = Logger.getLogger("hi");
		StringBuilder str = new StringBuilder();
		HashMap<String,Integer> wordcount = new HashMap<>();
		try {
		String address = "C:/Users/Tringapps-User25/freq.txt";
        File f = new File(address);
        Scanner sc = new Scanner(f);       
        while (sc.hasNextLine())
        {
        	str.append(sc.nextLine());
        	str.append(" ");
        }
		}
		catch(Exception e)
		{
			String s = ""+e;
			logger.info(s);
		}
        String[] words = str.toString().split(" ");
        for(int i=0;i<words.length;i++)
        {
        	if(wordcount.containsKey(words[i]))
        	{
        		wordcount.put(words[i],wordcount.get(words[i]) +1);
        	}
        	else
        	{
        		wordcount.put(words[i], 1);
        	}
        	
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)-> {
        	return b.getValue() - a.getValue();
        });    
      	for(Map.Entry<String,Integer> e : wordcount.entrySet())
       	{       		
      		pq.add(e);
        }
        while(!pq.isEmpty())
        {
        	logger.log(Level.INFO,()->"\n"+pq.poll());
        }
    }
}
