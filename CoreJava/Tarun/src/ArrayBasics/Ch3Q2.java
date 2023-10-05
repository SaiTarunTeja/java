package ArrayBasics;

import java.util.Scanner;

public class Ch3Q2 {

	public static void main(String[] args) {
		// count positive and negative numbers in Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]= new int[length];
		System.out.println("Enter Array Elements");
		int x,negative=0,positive=0,even=0,odd=0,zero=0;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				negative++;
			}
			else if(a[x]>0)
			{
				positive++;
			}
			else
			{
				zero++;
			}
		}
		for(x=0;x<a.length;x++)
		{
		    if(a[x]%2==0 && a[x]!=0)
			{
				even++;
			}
			else if(a[x]%2!=0 && a[x]!=0)
			{
				odd++;
			}
		}
		System.out.println(negative+" Negative elements present in the array");
		System.out.println(positive+" Positive elements present in the array");
		System.out.println(zero+" Zeroes present in the array");
		System.out.println(even+" Even elements present in the array");
		System.out.println(odd+" Odd elements present in the array");

	}

}
