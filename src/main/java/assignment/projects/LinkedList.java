package assignment.projects;

import java.util.logging.Logger;
class LinkedList{
	Logger logger = Logger.getLogger("hio");
    NodeClass rootnode;
    int count = 0;
    LinkedList()
    {
    	rootnode = null;
    }
    
    public void addElement(String name)
    {
    	
            if(rootnode == null)
            {
                rootnode= new  NodeClass(name);
                count++;
            }
            else
            {
                NodeClass temp = rootnode;
                while(temp.nextnode != null)
                {
                    temp = temp.nextnode;
                }
                temp.nextnode = new NodeClass(name);
                count++;
            }
    }
    
    public void removeElement(String remname){
    	NodeClass temp = rootnode;
		NodeClass prev=rootnode;
		String str = "Deleted Contact Sucessfully";
		int mark=0;
		while(temp!=null)
		{
			if(remname.equals(rootnode.name))
			{
				mark=1;
				rootnode=temp.nextnode;
				logger.info(str);
				temp = null;
			}
			else if(remname.equals(temp.name))
			{
					mark=1;
					logger.info(str);
					prev.nextnode=prev.nextnode.nextnode;
					rootnode = prev;
					break;
				
			}
			else
			{
				prev = temp;
				temp=temp.nextnode;	
			}
			
		}
		if(mark == 0)
		{
			logger.info("No Contact found ");
		}
		
	}
    
    public void search(String search)
    {
    	int flag = 0;
    	NodeClass searchnode = rootnode;
    	while(searchnode != null)
    	{
    		if(search.equals(searchnode.name))
    		{
    			flag = 1;
        		String a ="Name:"+searchnode.name;
    			logger.info(a);
    		}
    		searchnode = searchnode.nextnode;
    	}
    	if(flag == 0)
    	{
    		logger.info("No Contact on the List");
    	}
    }
 
    public void print()
    {
    	NodeClass temp1 = rootnode;
    	if(temp1 == null)
    	{
    		logger.info("Empty List");
    	}
    	else
    	{
    		while(temp1 != null)
    		{
        		String a ="Name:"+temp1.name;
    			logger.info(a);
    			temp1 = temp1.nextnode;
    		}
    		
    	}
    }
}