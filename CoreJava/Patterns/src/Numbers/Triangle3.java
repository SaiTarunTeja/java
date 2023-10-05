package Numbers;
import java.util.*;
public class Triangle3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		withoutDistrubing_rows(rows);
		System.out.println("================");
		withDistrubing_rows(rows);
		
	}
	public static void withoutDistrubing_rows(int rows)
	{
		for(int x=1;x<=rows;x++)
		{
			int count=0;
			for(int y=rows;count<x;y--)
			{
				System.out.print(y+" ");
				count++;
			}
			System.out.println();
		}
	}
	public static void withDistrubing_rows(int rows)
	{
		for(int x=rows;x>=1;x--)
		{
			for(int y=rows;y>=x;y--)
				System.out.print(y+" ");
			System.out.println();
		}
	}

}
