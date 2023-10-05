package SpecificIndex;

import java.util.Scanner;
public class Butterfly {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows Number");
		int rows = sc.nextInt();
		for (int x = 1; x <= rows; x++) 
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1 || y==x || x==rows&&y==rows)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int z=rows;z>x;z--)
				System.out.print("  ");
			for(int z=rows-1;z>x;z--)
				System.out.print("  ");
			for(int y=1;y<=x;y++)
			{
				if(x==rows)
				{
					while(y<rows)
					{
						if(y==rows-1)
						{
							System.out.print("* ");
							y++;
						}
						else
						{
							System.out.print("- ");
							y++;
						}
					}
				}		
				else
				{
					if(y==1 || x==y)
						System.out.print("* ");
					else
						System.out.print("- ");
				}
			}
			System.out.println();
		}
		for (int x = rows-1; x >= 1; x--) 
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1 || y==x || x==rows&&y==rows)
					System.out.print("* ");
				else
					System.out.print("- ");
			}
			for(int z=rows;z>x;z--)
				System.out.print("  ");
			for(int z=rows-1;z>x;z--)
				System.out.print("  ");
			for(int y=1;y<=x;y++)
			{
				if(x==rows)
				{
					while(y<rows)
					{
						if(y==rows-1)
						{
							System.out.print("* ");
							y++;
						}
						else
						{
							System.out.print("- ");
							y++;
						}
					}
				}		
				else
				{
					if(y==1 || x==y)
						System.out.print("* ");
					else
						System.out.print("- ");
				}
			}
			System.out.println();
		}
            
    }
}