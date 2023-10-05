package Chapter1;

public class Ch1Q6 {

//	Swap Adjacent Elements in the Array
	public static void main(String[] args)
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int x;
		System.out.println("Before Swapping");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		for(x=0;x<a.length;x+=2)
		{
			int temp=a[x];
			a[x]=a[x+1];
			a[x+1]=temp;
		}
		System.out.println("\nAfter Swapping");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		

	}

}


