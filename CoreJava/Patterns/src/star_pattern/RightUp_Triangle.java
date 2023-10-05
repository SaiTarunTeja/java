package star_pattern;
import java.util.*;
public class RightUp_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
