package ArrayBasics;

import java.util.Scanner;

public class SC_SelectionSort {

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
		for(x=0;x<a.length;x++)
		{
		    int sm=x;
		    for(y=x+1;y<a.length;y++)
		    {
		        if(a[sm]>a[y])
		        {
		            sm=y;
		        }
		    }
		    int temp=a[sm];
		    a[sm]=a[x];
		    a[x]=temp;
		}
		for(int zz:a)
		{
		    System.out.print(zz +" ");
		}

	}

}
