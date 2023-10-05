package ArrayBasics;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=1;x<a.length;x++)
		{
			for(y=0;y<a.length-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp =a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		System.out.println("Enter Search Element");
		int search=sc.nextInt();
		int low=0,high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(search==a[mid])
			{
				System.out.println("Element Found");
				break;
			}
			if(search<a[mid])
			{
				high=mid-1;
			}
			if(search>a[mid])
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("Element Not Found");
		}
		// TODO Auto-generated method stub

	}

}
