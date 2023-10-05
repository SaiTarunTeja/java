package Arrays;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Random r = new Random(10);
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
			System.out.print(a[i]+" ");
		}
		System.out.println("Reverse of Array");
//		for(int i=a.lendth-1;i>=0;i--)
//		{
//			a[i]=r.nextInt();
//			System.out.print(a[i]+" ");
//		}
	}

}