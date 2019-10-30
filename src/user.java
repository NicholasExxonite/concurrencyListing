import java.util.*;
import java.util.concurrent.Semaphore;

public class user
 {								
  private int id;
  private int num_elements;
  public static Buffer buf;
		  
  public user(int i, int el, Buffer b)	        			//User arguments: User ID, number of elements to add, and buffer
		  {id = i; num_elements = el; buf = b;}
  
  public void add_elements()
   {   										//Add element to buffer, element value iterates from 0, 1, 2 .... num_elements
	int n = 0;
	semaphore sem = new semaphore(1);
	while (num_elements > 0)
	{

	   buf.add(new Integer(n));							
	   n++;
	   num_elements--;
	   System.out.print("User: " + id + "added this element: " + n + "Elements left: " + num_elements + "\n");
	 }			
   }
  }  