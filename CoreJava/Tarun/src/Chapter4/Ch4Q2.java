package Chapter4;

public class Ch4Q2 {

	public static void main(String[] args) {
		int a[]=new int[] {12,56,34,23,1,67,76,32,75,90,345};
		int x,largest=a[0],y,second_largest=a[0],smallest=a[0],second_smallest=a[0];
		for(x=0;x<a.length;x++)
		{
			if(a[x]>a[0])
			{				
				largest=a[x];
			}			
		}
		
		System.out.println("largest element is "+largest);
		for(x=0;x<a.length;x++)
		{
			if(a[x]>second_largest&&a[x]<largest)
			{
				second_largest=a[x];
			}
		}
		System.out.println("Second largest element is "+second_largest);
		for(x=0;x<a.length;x++)
		{
			if(a[x]<smallest)
			{
				smallest=a[x];
			}
		}
		System.out.println("smallest element is "+smallest);
		for(x=0;x<a.length;x++)
		{
			if(a[x]<second_smallest&&a[x]>smallest)
			{
				second_smallest=a[x];
			}
		}
		System.out.println("smallest element is "+second_smallest);

	}

}
