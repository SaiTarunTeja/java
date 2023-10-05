package Numbers;
import java.util.*;
public class OuterSquareZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int rows = sc.nextInt();
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x==1 || y==1 || x==rows || y==rows)
					System.out.print(0+" ");
				else
					System.out.print(y*y+" ");
			}
			System.out.println();
		}
	}

}
