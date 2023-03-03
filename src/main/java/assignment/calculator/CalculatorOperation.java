package assignment.calculator;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CalculatorOperation 
{
    public void calculator()
    {
    	double num1;
    	double num2;
    	double result;
    	Logger log = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
    	String msg = "Enter Number";
    	log.info(msg);
    	num1 = sc.nextDouble();
    	Operation cl;
    	result = num1;
    	boolean ch = true;
    	while(ch)
    	{
        	log.info("Choose the Arithmetic Operation==>\n Addition-> +\n Substraction-> -\n Multiplication->*\n Division->/\n Exit the calculator-> e");
        	char operation = sc.next().charAt(0);
        	switch(operation)
        	{
        		case '+':
        		{
        			log.info(msg);
                	num2 = sc.nextDouble();
        			cl = new Add(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '-':
        		{
        			log.info(msg);
                	num2 = sc.nextDouble();
        			cl = new Subtract(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '*':
        		{
        			log.info(msg);
                	num2 = sc.nextDouble();
        			cl = new Multiply(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '/':
        		{
        			log.info(msg);
                	num2 = sc.nextDouble();
        			cl = new Divide(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case 'e':
        		{
        			ch=false;
        			break;
        		}
        		default:
        		{
        			log.info("Invalid Option");
        			break;
        		}
        	}
        	String res = String.valueOf(result);
        	log.log(Level.INFO,()->"The result is"+ res);
    	}
    }
    
}
