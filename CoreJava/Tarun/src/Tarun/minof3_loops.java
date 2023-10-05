package Tarun;

import java.util.Scanner;

public class minof3_loops {

	public static void main(String[] args)
	{
		System.out.println("Enter n1 value");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int i=1;
		while(i<3)
		{
			System.out.println("Enter n2 value");
			int n2 = sc.nextInt();
			if(n2<n1)
			{
			n1=n2;	
			}
			i++;
		}
         System.out.println("Smallest of 3 numbers is "+ n1);
	}

}
