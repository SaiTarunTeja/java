package Tarun;

import java.util.Scanner;

public class Tarun 
{

	public static void main(String[] args)
	{
	   int d;
	   System.out.println("enter a,b and c values");
	   Scanner s = new Scanner(System.in);
	   int a = s.nextInt();
	   int b = s.nextInt();
	   int c = s.nextInt();
	  if(a<b)
	  {
	    a=a+b;
	    b=a-b;
	    a=a-b;
	  }
	  if(a<c)
	  {  
	    a=a+c;
	    c=a-c;
	    a=a-c;
	  }
	  if(b<c)
	  {
	   b=b+c;
	   c=b-c;
	   b=b-c;
	  }
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
		
	}
}
