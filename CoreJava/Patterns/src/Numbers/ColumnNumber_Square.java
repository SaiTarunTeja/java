package Numbers;
import java.util.*;
public class ColumnNumber_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
				System.out.print(y+" ");
			System.out.println();
		}
		sc.close();
	}

}
