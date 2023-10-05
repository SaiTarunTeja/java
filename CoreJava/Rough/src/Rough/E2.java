package Rough;
import java.util.*;
public class E2 {

	public static void main(String[] args) {
//	  int a[]=new int[] {10,22,12,56};
	  Scanner sc=new Scanner(System.in);
	  int x;
	  System.out.println("enter y value");
	  int y=sc.nextInt();
	  int a[]=new int[4];
	  System.out.println("enter elements in an array");
	  try
	  {
	      for(x=0;x<a.length;x++)
	      {
		    a[x]=sc.nextInt();
	      }
	      System.out.println(a[5]);
	  
	    System.out.println(a[0]/y);
	  }
	
	  catch(Throwable AE)
	  {
		  System.out.println("Enter another value exept zero");
	  }
	 

	}

}
