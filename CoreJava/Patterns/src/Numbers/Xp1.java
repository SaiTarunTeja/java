package Numbers;
import java.util.*;
public class Xp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x==y || x+y==rows+1)
					System.out.print(x+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
