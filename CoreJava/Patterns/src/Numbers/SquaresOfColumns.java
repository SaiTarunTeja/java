package Numbers;
import java.util.*;
public class SquaresOfColumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=x;y>=1;y--)
			{
				if(y==rows && x==rows)
					System.out.print(0+" ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}

}
