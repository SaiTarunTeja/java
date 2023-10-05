package Arrays;
import java.util.*;
public class ReverseCopyArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			 a[x]=sc.nextInt();
		}
		System.out.println("copy Array Elements");
		int b[]=new int[a.length];
	    for(x=0;x<b.length;x++)
	    {
	    	b[x]=a[x];
	    }
	    for(x=0;x<b.length;x++)
	    {
	    	System.out.println(b[x]);
	    }
	    System.out.println("Reverse Array Elements");
	    for(x=b.length-1;x>=0;x--)
	    {
	    	System.out.println(b[x]);
	    }

	}

}
