package star_pattern;

public class halt1 {

	public static void main(String[] args) 
	{
		int r=5;
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int x=1;x<=r-1;x++)
		{
			for(int y=4;y>=x;y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
