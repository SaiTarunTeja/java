package Rough;

public class E5 {

	public static void main(String[] args) 
	{ 
	 try 
	 { 
	// This method returns the Class object associated with the class or interface with the given string name.
	   Class c = Class.forName("ArithmeticException"); 
	 }
	 catch(ClassNotFoundException cn) 
	 { 
	    System.out.println(cn.getMessage()); 
	  } 
	 } 
	}


