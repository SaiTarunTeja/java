package Numbers;

import java.util.Scanner;

public class Xp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		m1(rows);
		/*for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==x)
					System.out.print(y+" ");
				else
					System.out.print("  ");
			}
			for(int sp1=rows;sp1>x;sp1--)
				System.out.print("  ");
			for(int sp2=rows-1;sp2>x;sp2--)
				System.out.print("  ");
			for(int y=x;y<=x;y++)
			{
				if(x!=rows)
					System.out.print(y+" ");
			}
			System.out.println();
		}
		for(int x=rows-1;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==x)
					System.out.print(y+" ");
				else
					System.out.print("  ");
			}
			for(int sp1=rows;sp1>x;sp1--)
				System.out.print("  ");
			for(int sp2=rows-1;sp2>x;sp2--)
				System.out.print("  ");
			for(int y=x;y<=x;y++)
			{
				if(x!=rows)
					System.out.print(y+" ");
			}
			System.out.println();
		}*/

	}
	public static void m1(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==x || y==1)
					System.out.print(y+" ");
				else
					System.out.print("  ");
			}
			for(int sp1=rows;sp1>x;sp1--)
				System.out.print("  ");
			for(int sp2=rows-1;sp2>x;sp2--)
				System.out.print("  ");
			for(int y=1;y<=x;y++)
			{
				if(x!=rows )
					System.out.print(y+" ");
				
//				else
//					System.out.print("  ");
			}
			System.out.println();
		}
		for(int x=rows-1;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==x)
					System.out.print(y+" ");
				else
					System.out.print("  ");
			}
			for(int sp1=rows;sp1>x;sp1--)
				System.out.print("  ");
			for(int sp2=rows-1;sp2>x;sp2--)
				System.out.print("  ");
			for(int y=x;y<=x;y++)
			{
				if(x!=rows)
					System.out.print(y+" ");
				
//				else
//					System.out.print("  ");
			}
			System.out.println();
		}
	}

}