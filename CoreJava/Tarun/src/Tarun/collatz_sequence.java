package Tarun;
import java.util.*;
public class collatz_sequence {

	public static void main(String[] args) 
	{
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		while(n>1)
		{
			if(n%2==0)
			{
				n=n/2;
				System.out.println(n);
			}
			else
			{
				n=3*n+1;
				System.out.println(n);
			}
		}
		

	}

}
