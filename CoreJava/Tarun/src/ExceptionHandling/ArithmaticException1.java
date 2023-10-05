package ExceptionHandling;
import java.util.*;
public class ArithmaticException1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=10;
		System.out.println("Enter any number");
		int b=sc.nextInt();
		try
		{
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException AE)
		{
			System.out.println("try another number not a zero");
		}
		catch(InputMismatchException AE)
		{
			System.out.println("Enter number not a charecter");
		}
//		catch(Exception AE)
//		{
//			System.out.println("Enter number not a charecter or zero");
//		}
	}

}
