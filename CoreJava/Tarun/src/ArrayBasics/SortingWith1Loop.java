package ArrayBasics;

import java.util.Arrays;

public class SortingWith1Loop {

	public static void main(String[] args) {
//		Sort the Array with one loop
		 int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		 int x;
		 for(x=0;x<a.length-1;x++)
		 {
			 if(a[x]>a[x+1])
			 {
				 int temp=a[x];
				 a[x]=a[x+1];
				 a[x+1]=temp;
				 x=-1;
			 }
		 }
		 for(x=0;x<a.length;x++)
		 System.out.print(a[x]+" ");
		 

	}

}
