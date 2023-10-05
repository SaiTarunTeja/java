package Reiteration;

public class Pattern {

	public static void main(String[] args) {
//		RightAngle();
//		Square_no1();
//		Square_no2();
//		Tri_no3();
		halfPyramid();
//		hallo();
//		square1();
	}
	public static void RightAngle()
	{
		for(int x=4;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void Square_no1()
	{
		for(int x=1;x<=4;x++)
		{
			for(int y=1;y<=4;y++)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	public static void Square_no2()
	{
		for(int x=1;x<=4;x++)
		{
			for(int y=1;y<=4;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void Tri_no1()
	{
		for(int x=1;x<=4;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void Tri_no2()
	{
		for(int x=0;x<=4;x++)
		{
			for(int y=x+1;y>=1;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void Tri_no3()
	{
		for(int x=5;x>=1;x--)
		{
			for(int y=5;y>=x;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void halfPyramid()
	{
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for(int x=4;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void hallo()
	{
		for(int x=1;x<=6;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1||y==x||x==6 )
				System.out.print("# ");
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
	}
	public static void square1()
	{
		for(int x=1;x<=4;x++)
		{
			for(int y=x;y>=1;y--)
			{
				if(x==4&&y==4)
					System.out.print(0+" ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}
}
