package Chapter4;

import java.util.Scanner;

public class Ch4Q6 {

	public static void main(String[] args) {
//		 sum of diagonal Elements in the array
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of rows ");		
			int r1=sc.nextInt();
			System.out.println("Enter number of columns ");
			int c1=sc.nextInt();
			int a[][]=new int[r1][c1];
			System.out.println("Enter Array Elements");
			int x,y,sum1=0,sum2=0;
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
					System.out.print(a[x][y]+" ");
				}
				System.out.println();
			}
			for(x=0;x<r1;x++)
			{
				for(y=0;y<c1;y++)
				{
					if(x==y)
					{
						sum1=sum1+a[x][y];
					}
				}			
			}
			System.out.println("\nRigtht diagonal "+sum1);
			for(x=r1-1;x>=0;x--)
			{
				for(y=0;y<c1;y++)
				{
					if(x+y==r1-1)
					{
						sum2=sum2+a[x][y];
					}
				}			
			}
			System.out.println("\nLeft diagonal "+sum2);

		}

}


