package For_tarun;

public class PAPR {

	public static void main(String[] args)
	{
		int x,y,z;
		for(x=1;x<=6;x++)
		{
			for(y=5;y>=x;y--)
			{
				System.out.print(" ");
			}
			for(z=x;z>=1;z--)
			{
				System.out.print(z);
			}
			System.out.println();
		}

	}

}
