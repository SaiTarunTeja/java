package ArrayBasics;

import java.util.Scanner;

public class Ch4Q7 {

	public static void main(String[] args) {
//		 Transpose of matrix
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in matrix 1");
		int r1=sc.nextInt();
		System.out.println("Enter number of columns in matrix 1");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r1][c1];
		System.out.println("Enter Array Elements");
		int x,y,temp;
		for(x=0;x<r1;x++)
		{
			for(y=0;y<c1;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		
		for(x=0;x<r1;x++)
		{
			for(y=0;y<c1;y++)
			{
				temp=a[x][y];
				b[y][x]=temp;
			}
		}
		System.out.println("Original matrix ");
		for(x=0;x<r1;x++)
		{
			for(y=0;y<c1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose matrix ");
		for(x=0;x<r1;x++)
		{
			for(y=0;y<c1;y++)
			{
				System.out.print(b[x][y]+" ");
			}
			System.out.println();
		}

	}

}
