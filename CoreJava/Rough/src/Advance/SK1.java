package Advance;

import java.util.Scanner;

public class SK1 
{
	public static void main(String[] args) throws insufficientBalenceException 
	{
		Scanner sc=new Scanner(System.in);
		int currentBalence=10000;
		System.out.println("Enter Withdrawal Amount");
		int withdrawal=sc.nextInt();
		int num = 1;
		
		if(withdrawal<=currentBalence)
		{
			System.out.println("Please Collect Your cash");
			System.out.println("current balence in your account= "+(currentBalence-withdrawal));
		}
		else
		{
			try 
			{
				throw new insufficientBalenceException("insufficient Balence");
//			    throw new insufficientBalenceException();
			}
			catch(Exception e)
			{
				System.out.println("Caught an exception");
				System.out.println(e.getMessage());
				throw e;
//				throw new insufficientBalenceException("insufficient Balence");
//				throw new ArithmeticException("insufficient Balence");
			}
		}			
	}	
}
class insufficientBalenceException extends Exception {
	public insufficientBalenceException(String str)
	{
		super(str);
	}
	public insufficientBalenceException()
	{
		super();
	}
}
class Test2 extends Exception {
	
}
class Test3 extends Exception {
	
}
