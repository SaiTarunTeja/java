package Chapter4;

public class Ch4Q1 {

	public static void main(String[] args) {
//		find second largest and smallest in Array with using sorting
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int x,y;
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
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println("\nSecond largest Element is "+a[a.length-2]);
		System.out.println("Second Smalest Element is "+a[1]);

	}

}
