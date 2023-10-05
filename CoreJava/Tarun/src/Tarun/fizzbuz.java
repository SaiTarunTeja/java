package Tarun;

import java.util.Scanner;

public class fizzbuz 
{

	public static void main(String[] args) 
	{
		int var = 1;
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		while(var<=a)
		{
			if(var%3==0 && var%5==0) 
			{
				System.out.println("fizzbuzz");
			}
		
			else if(var%3==0)
			{
				System.out.println("fizz");
			}
			else if(var%5==0) 
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println(var);
			}
			var++;
		}

	}

}
