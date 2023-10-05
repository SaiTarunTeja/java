package star_pattern;
import java.util.*;
public class RightHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		int half = rows/2;
		for(int x=1;x<=half;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int x=1;x<half;x++)
		{
			for(int y=half-1;y>=x;y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		int first = rows/2;
		int last = first+1;
		for(int x=1;x<=first;x++)
		{
		    for(int y=1;y<=x;y++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int x=1;x<=last;x++)
		{
		    for(int y=last;y>=x;y--)
		    {
		      System.out.print("* ");
		    }
		    System.out.println();
		}//*/
	}

}
