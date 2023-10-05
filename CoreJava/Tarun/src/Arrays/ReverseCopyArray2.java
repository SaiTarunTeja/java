package Arrays;
import java.util.*;
public class ReverseCopyArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			 a[x]=sc.nextInt();
		}
		System.out.println("Reverse Array Elements");
		int b[]=new int[a.length];
	    for(x=0,y=b.length-1;x<a.length;x++,y--)
	    {
	    	b[y]=a[x];
	    }
	    for(y=0;y<b.length;y++)
	    {
	    	System.out.println(b[y]);
	    }
	    System.out.println("Original & Reverse Array Elements");
	    for(x=0,y=0;x<a.length;x++,y++)
	    {
	    	System.out.println(a[x]+" "+b[y]);
	    }
	 
	    
	}

}
