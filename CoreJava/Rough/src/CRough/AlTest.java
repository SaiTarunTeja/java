package CRough;
import java.util.*;
public class AlTest 
{
	public static void main(String[] args) 
	{
//		int a[]=new int[] {1,2,3,4,5,6};
//		int s=5;
//		bs b=new bs();
//		int a1=b.m1(a,s);
//		if(a1==-1)
//			System.out.println("Element not found");
//		else
//			System.out.println("Element found at "+a1);
//		
//		System.out.println("heeee");
//		result r1=new result();r1.re();
		TreeSet t=new TreeSet();
		/*t.add(null);
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		t.add(new Integer(10));*///classCastException
//		t.add(null);//NullPointerException
		System.out.println(t);
	}	
}
class bs
{
	public int m1(int a[],int search)
	{
//		int a[]=new int[] {1,2,3,4,5,6};
		int f=0,l=a.length-1;
		while(f<=l)
		{
			int m=(l+f)/2;
			if(a[m]==search)
				return m;
			if(search<a[m])
				l=m-1;
			if(search>a[m])
				f=m+1;
		}
		return -1;
	}
}
class result
{
	public void re()
	{
		BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);	
	}
}
class BinarySearch {
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}