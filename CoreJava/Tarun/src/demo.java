
public class demo {

	public static void main(String[] args) {
		int n=12,x,y,high=0,count=0,k=0;
		for(x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		for(x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				a[k]=x;
				k++;
			}
		}
		
		for(x=0;x<a.length;x++)
		{
			int c=0;
			for(y=1;y<=a[x];y++)
			{
				if(a[x]%y==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				 high=a[x];
			}
		}
		System.out.println(high);

	}

}
