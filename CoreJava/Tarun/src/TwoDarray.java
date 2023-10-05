import java.util.*;
public class TwoDarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=2,c=2;
		int a[][]=new int[r][c];
		int x,y;
		System.out.println("Enter Elements in array");
		for(x=0;x<r;x++)
		{
			for(y=0;y<c;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		for(x=0;x<r;x++)
		{
			for(y=0;y<c;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
