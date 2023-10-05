package Numbers;
import java.util.*;
public class MiddleColumnSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(y==1 || y==rows)
					System.out.print(0+" ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}

}
