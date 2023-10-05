package ArrayBasics;

import java.util.Scanner;

public class Ch3Q1 {

	public static void main(String[] args) {
		// find the number to be searched is present in the array
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array elements");
		int x,count=0;
		boolean flag=false;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Enter Search Element");
		int search=sc.nextInt();
		for(x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				flag=true;
				count++;
				System.out.println("Element found at "+(x+1)+" position");
			}
		}
		if(flag==true)
		{
			System.out.println("Element repeats "+count+" times");
		}
		else 
		{
			System.out.println("Element not found");
		}
		

	}

}
