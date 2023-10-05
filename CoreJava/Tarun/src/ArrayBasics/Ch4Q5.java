package ArrayBasics;
import java.net.MulticastSocket;
import java.util.*;
public class Ch4Q5 {

	public static void main(String[] args) {
//		 Multiplication of two matrices
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in matrix 1");
		int r1=sc.nextInt();
		System.out.println("Enter number of columns in matrix 1");
		int c1=sc.nextInt();
		System.out.println("Enter Array Elements");
		int x,y,z;
		int a[][]=new int[r1][c1];
		for(x=0;x<r1;x++)
		{
			for(y=0;y<c1;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		System.out.println("Enter number of rows in matrix 2");
		int r2=sc.nextInt();
		System.out.println("Enter number of columns in matrix 2");
		int c2=sc.nextInt();
		System.out.println("Enter Array Elements");
		int b[][]=new int[r2][c2];
		for(x=0;x<r2;x++)
		{
			for(y=0;y<c2;y++)
			{
				b[x][y]=sc.nextInt();
			}
		}
		int d[][]=new int[r1][c2];
		if(c1==r2)
		{
			System.out.println("Multiplication of two matrices");
			for(x=0;x<c1;x++)
			{
				for(y=0;y<r2;y++)
				{
					d[x][y]=0;
					for(z=0;z<c2;z++)
					{
						d[x][y]=d[x][y]+a[x][z]*b[z][y];
					}
				}
			}
			for(x=0;x<c1;x++)
			{
				for(y=0;y<r2;y++)
				{
					System.out.print(d[x][y]+" ");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.println("Multiplication of these two matrices are not possible");
		}
		

	}

}
