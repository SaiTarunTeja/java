package Array;

public class Pattern {

	public static void main(String[] args) {
		int i,j,x;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("_ ");
			}
			for(x=i;x>=1;x--)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			
		}
		for(i=1;i<=5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("_ ");
			}
			for(x=i;x>=1;x--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
