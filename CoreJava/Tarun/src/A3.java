
public class A3 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,5,6,7,8,9,10};
		int x,sum=0,asum=0,count=1;
		/*for(x=1;x<=10;x++)
		{
			sum=sum+x;
		}
		System.out.println(sum);
		for(x=0;x<a.length;x++)
		{
			asum=asum+a[x];
		}
		System.out.println(asum);
		int missing=sum-asum;
		System.out.println(missing);*/

			for(x=0;x<a.length;x++)
			{
				if(a[x]!=count)
				{
					System.out.println(count);
					break;
				}
				count++;
			}
		
		
	}

}
