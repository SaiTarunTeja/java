package Exam;
import java.util.*;

import CRough.Treeset;
public class SecondLargestInArray {

	public static void main(String[] args) {
		Integer a[]=new Integer[] {5,9,2,46};
		secondLargest s=new secondLargest();
		secondLargest.Sort(a);
	}
	
}
class secondLargest
{

	public static void Sort(Integer[] a)
	{
		//if array contains duplicate elements it is not work
		for(int x=1;x<a.length;x++)
		{
			for(int y=0;y<a.length-1;y++) 
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
	}
	
}