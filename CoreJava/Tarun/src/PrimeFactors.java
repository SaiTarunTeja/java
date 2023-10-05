
public class PrimeFactors {

	public static void main(String[] args) {
		int n=12,x,y,k,high=0;
		int a[]=new int[n];
		for(x=1,k=0;x<=n;x++)
		{
			if(n%x==0)
			{	
				int count=0;
				for(y=1;y<=x;y++)
				{
					if(x%y==0)
					{
						count++;
					}					
				}
				if(count==2)
				{
					 high=x;
				}
				
			}
			
		}
		System.out.println(high);
		// TODO Auto-generated method stub

	}

}
