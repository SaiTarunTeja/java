package Chapter3;

import java.util.Scanner;

public class Ch3Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Array 'A' is ");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		int sum=0;
		for(x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println("\nSum of All the elements in array is "+sum);

	}

}
