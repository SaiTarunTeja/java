package Reiteration;
import java.util.*;
public class pattern4 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number Of Rows");
//		int rows = sc.nextInt();
//		p1(rows);
//		p2(rows);
//		p3(rows);
//		p4(rows);
//		p5(rows);
//		p6(rows);
//		p7(rows);
//		p8(rows);
//		p9(rows);
//		p10(rows);
		Random r = new Random();
		Long AccountNumber = Math.abs(r.nextLong(1000000000000L));
		System.out.println(AccountNumber);
	}
	public static void p1(int rows)
	{
		
		int z=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==rows && y==rows)
					System.out.print(0+" ");
				else
				{
					System.out.print(z+" ");
					z++;
				}
			}
			System.out.println();
		}
	}
	public static void p2(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==y || y==1 || x==rows)
					System.out.print(x+" ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void p3(int rows)
	{
		int z=1;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(x==y || y==1 || x==rows)
				{
					System.out.print(z+" ");
					z++;
				}
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void p4(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=x;y>=1;y--)
				System.out.print(y+" ");
			System.out.println();
		}
		for(int x=rows-1;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
				System.out.print(y+" ");
			System.out.println();
		}
	}
	public static void p5(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void p6(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<x;y++)
				System.out.print("  ");
			for(int z=5;z>=x;z--)
				System.out.print("* ");
			System.out.println();
		}
		for(int x=2;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void p7(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
			{
				if(x==rows && z==rows)
					System.out.print("0 ");
				else
					System.out.print(z*z+" ");
			}
			for(int w=x-1;w>0;w--)
				System.out.print(w*w+" ");
			System.out.println();
		}
		for(int x=2;x<=rows;x++)
		{
			for(int y=1;y<x;y++)
				System.out.print("  ");
			for(int z=x;z<=rows;z++)
				System.out.print("* ");
			for(int w=x;w<rows;w++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void p8(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
			{
				if(x==rows || z==1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int w=1;w<x;w++)
			{
				if(x==rows || w==x-1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
		for(int x=rows-1;x>=1;x--)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
			{
				if(x==rows || z==1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int w=1;w<x;w++)
			{
				if(x==rows || w==x-1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
	public static void p9(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
			{
				if(z==1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int w=1;w<x;w++)
			{
				if(w==x-1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
				System.out.println();			
		}
		for(int x=rows-1;x>0;x--)
		{
			for(int y=rows;y>x;y--)
				System.out.print("  ");
			for(int z=1;z<=x;z++)
			{
				if(z==1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int w=1;w<x;w++)
			{
				if(w==x-1)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
				System.out.println();			
		}
	}
	public static void p10(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<x;y++)
				System.out.print("  ");
			for(int z=rows;z>=x;z--)
				System.out.print("* ");
			for(int w=rows;w>x;w--)
				System.out.print("* ");
			System.out.println();
		}
		for(int x=rows-1;x>=1;x--)
		{
			for(int y=1;y<x;y++)
				System.out.print("  ");
			for(int z=rows;z>=x;z--)
				System.out.print("* ");
			for(int w=rows;w>x;w--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
