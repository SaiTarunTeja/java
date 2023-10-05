package Chapter1;

public class Ch1Q7 {

	public static void main(String[] args) {
//		sort the Array elements  both in ascending and decending order
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int x,y;
		//Bubble Sort
		for(x=1;x<a.length;x++)
		{
			for(y=0;y<a.length-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		System.out.println("Ascinding order");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println("\ndescinding order");
		for(x=1;x<a.length;x++)
		{
			for(y=0;y<a.length-x;y++)
			{
				if(a[y]<a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(x=0;x<a.length;x++)
		System.out.print(a[x]+" ");
		System.out.print("\n_____________________________________");
		//Selection sort
		int b[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("\nAscending Order\n");
		for(x=0;x<b.length;x++)
		{
			int sn=x;
			for(y=x+1;y<b.length;y++)
			{
				if(a[sn]>a[y])
				{
					sn=y;
				}
			}
			int temp=a[sn];
			a[sn]=a[x];
			a[x]=temp;
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println("\nDecending Order");
		for(x=0;x<b.length;x++)
		{
			int sn=x;
			for(y=x+1;y<b.length;y++)
			{
				if(a[sn]<a[y])
				{
					sn=y;
				}
			}
			int temp=a[sn];
			a[sn]=a[x];
			a[x]=temp;
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.print("\n_____________________________________");
//		normal sorting
		int c[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.println("\nAscending order");
		for(x=0;x<c.length;x++)
		{
			for(y=0;y<c.length;y++)
			{
				if(c[x]<c[y])
				{
					int temp=c[x];
					c[x]=c[y];
					c[y]=temp;
				}
			}
		}
		for(x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}
		System.out.println("\nDecending order");
		for(x=0;x<c.length;x++)
		{
			for(y=0;y<c.length;y++)
			{
				if(c[x]>c[y])
				{
					int temp=c[x];
					c[x]=c[y];
					c[y]=temp;
				}
			}
		}
		for(x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}

	}

}
