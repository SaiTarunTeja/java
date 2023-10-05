package Reiteration;
import java.util.*;
public class Pattern2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		X_pattern();
//		squareX();
//		alphabet1();
//		alphabet2();
//		alphabet3();
//		alphabet4();
//		numpat1();
//		numpat2();
		triangle1();
	}
	public static void X_pattern()
	{
		int rows=4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=4;y++)
			{
				if(x==y || (x+y)==(rows+1))
				{
					System.out.print("# ");
				}
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
	}
	public static void squareX()
	{
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x==y || x+y==rows+1 || y==1 || y==rows || x==1 ||x==rows)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void alphabet1()
	{
		int rows = 3;
		int col = 5;
		int val=65;
		for(int x=1;x<=rows;x++)
		{
			val=65;
			for(int y=1;y<=col;val++,y++)
			{
				System.out.print((char)val+" ");
			}
			System.out.println();
		}
	}
	public static void alphabet2()
	{
		int rows = 3;
		int col = 5;
		int var = 65;
		for(int x=1;x<=rows;x++)
		{
			var = 65;
			for(int y=1;y<=col;y++,var++)
			{
				if(y%2==0)
					System.out.print("# ");
				else
					System.out.print((char)var+" ");
			}
			System.out.println();
				
		}
	}
	public static void alphabet3()
	{
		int rows = 3;
		int col = 5;
		int var = 65;
		for(int x=1;x<=rows;x++)
		{
			var = 65;
			for(int y=1;y<=col;y++)
			{
				if(y%2!=0)
				{
					System.out.print((char)var+" ");
					var++;
				}
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void alphabet4()
	{
		int rows = 4;
		int col = 4;
		int var = 65;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=4;y++)
			{
				if(x%2!=0)
				{
					System.out.print((char)var+" ");
					var++;
				}
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void numpat1()
	{
		int rows = 4;
		int col = 4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=col;y++)
			{
				if(y==2 || y==3)
					System.out.print(y*y+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	public static void numpat2()
	{
		int rows = 8;
		int col = 4;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=col;y++)
			{
				if(x==1 || y==1 || x==rows || y==col)
					System.out.print(0+" ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}
	public static void triangle1()
	{
		int rows = sc.nextInt();
		
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
				System.out.print("* ");
			System.out.println();
		}
		for(int x=2;x<rows;x++)
		{
			for(int y=1;y<=x;y++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
