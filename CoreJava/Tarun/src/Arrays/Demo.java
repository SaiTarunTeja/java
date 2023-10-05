package Arrays;

public class Demo 
{
	public static void main(String[] args)
	{
		int[] a=new int[] {10,20,30,40,50,60,70,80,90,100};
		int x,y;
		for(int zz:a)
		{
			System.out.print(zz + "  ");
		}
		System.out.println();
		for(y=0;y<4;y++)//y=0//y=1
		{
			int temp=a[0];//temp=10
			for(x=0;x<a.length-1;x++)//x=0
			{
				a[x]=a[x+1];//a[0]=a[1]
			}
			a[x]=temp;
			
			for(int zz:a)
			{
				System.out.print(zz + "  ");
			}
			System.out.println( );
		}
			

	}

}
