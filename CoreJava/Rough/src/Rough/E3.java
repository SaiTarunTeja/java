package Rough;
import java.util.*;
public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of y");
		int y=sc.nextInt();
		int a[]=new int[] {1,2,3,4};
		try
		{
          System.out.println(a[5]);

			System.out.println(y/0);
		}
		catch( ArrayIndexOutOfBoundsException|NullPointerException|ArithmeticException  ex )
		
		{
			
			System.out.println("Try Again");
		}
		finally
		{
			System.out.println("finally");
		}

	}

}
