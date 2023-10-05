package Reiteration;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		int[] a = new int[] {5,4,3,2,1,6};
		System.out.println("Arrays Before sort ==> "+Arrays.toString(a)); 
		System.out.println("Traditional Sort ==> "+Arrays.toString(traditionalSort(a)));
		System.out.println("minusOneSort ==> "+Arrays.toString(minusOneSort(a)));
		System.out.println("bubbleSort ==> "+Arrays.toString(bubbleSort(a)));
		System.out.println("selectionSort ==> "+Arrays.toString(selectionSort(a)));
		Arrays.sort(a);
		System.out.println("Arrays.sort ==> "+Arrays.toString(a)); 
		
		//		int[] sortedArray = traditionalSort(a);
//	    for(int x:sortedArray)
//	    	System.out.print(x);

	}
	public static int[] traditionalSort(int[] a)
	{
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int temp = a[x];
					a[x] = a[y];
					a[y] = temp;
				}
			}
		}
		return a;
	}
	public static int[] minusOneSort(int[] a)
	{
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int temp  = a[x];
				a[x] = a[x+1];
				a[x+1] = temp;
				x=-1;
			}
		}
		return a;
	}
	public static int[] bubbleSort(int[] a)
	{
		for(int x=1;x<a.length;x++)
		{
			for(int y=0;y<a.length-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp = a[y];
					a[y] = a[y+1];
					a[y+1] = temp;
				}
			}
		}
		return a;
	}
	public static int[] selectionSort(int[] a)
	{
		for(int x=0;x<a.length;x++)
		{
			int sn = x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[sn]>a[y])
				{
					sn=y;
				}
				int temp = a[sn];
				a[sn] = a[x];
				a[x] = temp;
			}
			
		}
		return a;
	}
}
