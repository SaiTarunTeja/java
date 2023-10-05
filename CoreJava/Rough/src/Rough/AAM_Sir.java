package Rough;

public class AAM_Sir 
{
	public static void main(String[] args) 
	{	
		test t1=new test();
	    t1.m1();
	}
}
class test
{
    public String m1()
    {
        try
	    {
		  System.out.println("Hello World");
		 // return "TTT";
	    }
	    catch(Exception E){
	        System.out.println("Hi");
	    }
	    System.out.println("out");
	    return "AAA";
    }
}