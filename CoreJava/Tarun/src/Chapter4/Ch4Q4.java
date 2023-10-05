package Chapter4;

import java.util.Scanner;

public class Ch4Q4 {

	public static void main(String[] args) {
//		 Addition and Subtration of matrix
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of Rows");
			int r=sc.nextInt();
			System.out.println("Enter Number of Columns");
			int c=sc.nextInt();
			int a[][]=new int[r][c];
			int b[][]=new int[r][c];
			int d[][]=new int[r][c];
			int e[][]=new int[r][c];
			int x,y;
			System.out.println("Enter Elements in first Array");
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					a[x][y]=sc.nextInt();
				}
			}
			System.out.println("Enter Elements in Second Array");
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					b[x][y]=sc.nextInt();
				}
			}
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					d[x][y]=a[x][y]+b[x][y];
				}
			}
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					e[x][y]=a[x][y]-b[x][y];
				}
			}
			System.out.println("Addition of two Array");
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					System.out.print(d[x][y]+" ");
				}
				System.out.println();
			}
			System.out.println("Subtraction of two Array");
			for(x=0;x<r;x++)
			{
				for(y=0;y<c;y++)
				{
					System.out.print(e[x][y]+" ");
				}
				System.out.println();
			}

	}

}
