package Numbers;
import java.util.*;
public class Triangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=x;y>=1;y--)
				System.out.print(y+" ");
			System.out.println();
		}
		sc.close();
	}

}
