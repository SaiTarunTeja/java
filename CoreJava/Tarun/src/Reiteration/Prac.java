package Reiteration;

public class Prac 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {3,6,2,8,1,9};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				for(y=0;y<a.length;y++)
				{
					if(a[y]%2==0)
				  {
					if(a[x]<a[y])
					{
						int temp=a[x];
						a[x]=a[y];
						a[y]=temp;
					}
				  }
				}
//				System.out.println(a[x]);
//				System.out.println("     ");
			}
			else
			{
				for(y=0;y<a.length;y++)
				{
					if(a[y]%2!=0)
				  {
					if(a[x]<a[y])
					{
						int temp=a[x];
						a[x]=a[y];
						a[y]=temp;
					}
				  }
				}
			}
		}
		for(int z:a)
		{
			System.out.println(z);
		}
	}

}
