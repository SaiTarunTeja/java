package star_pattern;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
