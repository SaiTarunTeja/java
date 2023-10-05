import java.util.*;
public class LeftDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=2,c=2,x,y;
		int a[][]=new int[r][c];
		System.out.println("Enter Elements in 'a[]' Array");
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
				if(x==y)
				{
				  System.out.println(a[x][y]+" ");
				}
			}
//			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
