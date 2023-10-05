package Rough;

public class CheckedExceptionEx1 {

	public static void main(String[] args) //throws InterruptedException
	{
//		System.out.println("Hello Java"); 
		// Apply the try-catch block to handle checked exception.
		   try 
		   { 
		     Thread.sleep(1000); 
		   } 
		   catch(InterruptedException e) 
		   { 
		     //printStackTrace(); 
		     System.out.println("Hello Java");
		    } 

	}

}
