package ArrayBasics;
import java.util.*;
public class Ch4Q3 {

	public static void main(String[] args) {
//		 insert and display 2D array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of columns");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<r;x++)
		{
			for(y=0;y<c;y++)
			{
			  a[x][y]=sc.nextInt();
			}
		}
		for(x=0;x<r;x++)
		{
			for(y=0;y<c;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		
	}

}
