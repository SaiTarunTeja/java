package Tarun;

import java.util.Scanner;

public class swapping_3_variables {

	public static void main(String[] args) 
	{
		System.out.println("Enter a,b and c");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		a = a+b+c;
		b = a-b-c;
		c = a-b-c;
		a = a-b-c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
