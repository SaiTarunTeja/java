package P1;

public class TryReturnTest2 {
	int m1()
	{
	    try 
	    {
	         System.out.println("I am in try block");
	         return 50;
	    }
	    catch(Exception e)
	    {
	          System.out.println("I am in catch block");
	    }
	    return 20;
	}
	public static void main(String[] args) 
	{
	  TryReturnTest2 ft = new TryReturnTest2();
	  System.out.println(ft.m1());
	  }
}
