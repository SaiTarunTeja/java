package ArrayBasics;
import java.util.*;
public class MinimumElement {

	public static void main(String[] args) {
		//Max and Min Element of Array
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length of an Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		int max=a[0];
		for(x=1;x<a.length;x++)
		{
			if(a[x]<max)
			{
				max=a[x];
			}
		}
		System.out.println("Max Element in this Array is "+max);
		int min=a[0];
		for(x=1;x<a.length;x++)
		{
			if(a[x]>min)
			{
				min=a[x];
			}
		}
		System.out.println("Min Element in this Array is "+min);
		// TODO Auto-generated method stub

	}

}
