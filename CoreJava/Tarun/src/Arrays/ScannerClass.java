package Arrays;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = sc.nextInt();
		int a[]=new int[length];
		int x;
		System.out.println("Enter Input Values");
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Output is");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}

}
