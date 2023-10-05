package Chapter2;

import java.util.Scanner;

public class Ch2Q1 {

	public static void main(String[] args) {
		//write a program to copy all the elements in 'A' array into 'B' array
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter Array length");
				int length = sc.nextInt();
				int a[]=new int[length];
				System.out.println("Enter Array Elements");
				int x;
				for(x=0;x<a.length;x++)
				{
					a[x]=sc.nextInt();
				}
				System.out.println("our array is ");
				for(x=0;x<a.length;x++)
				{
					System.out.print(a[x]+" ");
				}
				int b[]=new int[length];
				System.out.print("\ncopied array\n");
				for(x=0;x<a.length;x++)
				{
					b[x]=a[x];
				}
				for(x=0;x<a.length;x++)
				{
					System.out.print(b[x]+" ");
				}

	}

}
