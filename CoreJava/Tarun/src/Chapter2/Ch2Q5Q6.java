package Chapter2;

import java.util.Scanner;

public class Ch2Q5Q6 {

	public static void main(String[] args) {
		//copy all the even elements in 'A' array into 'B' array		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter array length");
				int length=sc.nextInt();
				int a[]=new int[length];
				System.out.println("Enter Array Elements");
				int x;
				for(x=0;x<a.length;x++)
				{
					a[x]=sc.nextInt();
				}
				System.out.println("our Array 'A' is ");
				for(x=0;x<a.length;x++)
				{
					System.out.print(a[x]+" ");
				}
				System.out.println("\nArray 'B' or even elements in array ");
				int b[]=new int[length];
				for(x=0;x<a.length;x++)
				{
				  if(a[x]%2==0)
				  {
					  b[x]=a[x];
				  }
				}
				for(x=0;x<b.length;x++)
				{
					if(b[x]!=0)
					{
						System.out.print(b[x]+" ");
					}
				}
				//copy all the even elements in 'A' array into 'B' array
				System.out.println("\nArray 'c' or odd elements in array ");
				int c[] = new int[length];
				for(x=0;x<a.length;x++)
				{
					if(a[x]%2!=0)
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
