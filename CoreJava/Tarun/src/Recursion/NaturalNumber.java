package Recursion;

import java.util.*;
public class NaturalNumber 
{
	static Scanner sc = new Scanner(System.in);
	static int start,end;
	public static void main(String[] args) {
		System.out.println("Enter Starting Number");
		start = sc.nextInt();
		System.out.println("Enter Ending Number");
		end = sc.nextInt();
		if(start<=end)
			naturalNumberIncrease(start);
		else
			naturalNumberDecrease(start);
		
	}
	public static void naturalNumberIncrease(int start)
	{
		if(start<=end)
		{
			System.out.print(start+" ");
			naturalNumberIncrease(start+1);
		}
	}
	public static void naturalNumberDecrease(int start)
	{
		if(start>=end)
		{
			System.out.print(start+" ");
			naturalNumberDecrease(start-1);
		}
	}
}
