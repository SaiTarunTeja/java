package Reiteration;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Array Size and Elements");
//		int size = sc.nextInt();
//		int a[] = new int[size];
//		for(int x=0;x<=size;x++)
//		{
//			a[x] = sc.nextInt();
//		}
		int[] a = new int[] {4,3,5,2,1,6};
		System.out.println("Enter Search Element");
		int search = sc.nextInt();
		if(binarySearch(a,search))
			System.out.println("Element Found");
		else
			System.out.println("Element Not found");
	}
	public static boolean linearSearch(int a[],int search)
	{
		boolean flag=false;
		for(int x=0;x<=a.length;x++)
		{
			if(a[x]==search)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static boolean binarySearch(int a[],int search)
	{
		boolean flag=false;
		int low = 0;
		int high = a.length-1;
//		for(int x=0;x<=a.length;x++)
		while(low<high)
		{
			int mid = (low+high)/2;
			if(a[mid]==search)
			{
				flag = true;
				break;
			}
			else if(a[mid]>search)
				low = mid+1;
			else if(a[mid]<search)
				high = mid-1;

		}
		return flag;
	}
}
