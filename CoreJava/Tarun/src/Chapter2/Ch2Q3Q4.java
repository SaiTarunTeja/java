package Chapter2;

import java.util.Scanner;

public class Ch2Q3Q4 {

	public static void main(String[] args) {
		//copy all the even indexed elements in 'A' Array into 'B' array	
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter length of Array");
				int length = sc.nextInt();
				int a[]=new int[length];
				System.out.println("Enter Array Elements");
				int x;
				for(x=0;x<a.length;x++)
				{
					a[x]=sc.nextInt();
				}
				System.out.println("our 'A' Array is ");
				for(x=0;x<a.length;x++)
				{
					System.out.print(a[x]+" ");
				}
				System.out.println("\n'B' Array is ");
				System.out.println(" even indexed elements ");
				int b[]=new int[length];
				for(x=0;x<a.length;x++)
				{
					if(x%2==0)
					b[x]=a[x];
				}
				for(x=0;x<b.length;x++)
				{
					if(b[x]!=0)
					{
				     System.out.print(b[x]+" ");
					}
				}
				//copy all the odd indexed elements in 'A' Array into 'c' array
				System.out.println("\n'c' Array is ");
				System.out.println(" odd indexed elements ");
				int c[]=new int[a.length];
				for(x=0;x<a.length;x++)
				{
					if(x%2!=0)
					{
						c[x]=a[x];			
					}
				}
				for(x=0;x<c.length;x++)
				{
					if(c[x]!=0)
					{
						System.out.print(c[x]+" ");
					}
				}

	}

}
