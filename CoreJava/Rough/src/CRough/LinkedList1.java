package CRough;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 

		// Adding elements in the list. 
		    list.add(10); 
		    list.add(20); 
		    list.add(30); 
		    list.add(40); 
		    list.add(50); 
		  
		   System.out.println("LinkedList original order"); 
		   System.out.println(list); 
		 
		   ListIterator<Integer> litr = list.listIterator(); 
		   System.out.println("Interating in forward direction"); 
		   while(litr.hasNext())
		   { 
		     Object obj = litr.next(); 
		     System.out.println(obj); 
		   } 
		   System.out.println("Iterating in backwrd direction"); 
		   while(litr.hasPrevious())
		   { 
		      Object obj1 = litr.previous(); 
		      System.out.println(obj1); 
		  
		   // This statement will throw Concurrent Modification Exception 
		   // because we cannot add or remove an element in the LinkedList during the iteration.
		      list.remove(60);  
		    } 
		   System.out.println(list); 
	}

}
