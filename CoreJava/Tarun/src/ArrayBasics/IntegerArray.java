package ArrayBasics;
import java.util.*;
public class IntegerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array length");
		int length = sc.nextInt();
		System.out.println("Enter Array Elements");
		int a[]=new int[length];
	    int x;
	    for(x=0;x<a.length;x++) //x=0->1 |*| x=1->2 |*| x=2->3 |*| x=3->4 |*| x=4->4!<4 condition false
	    {
	    	a[x]=sc.nextInt();
	    }
	    System.out.println("Your Arrayn is");
	   /* for(x=0;x<a.length;x++)
	    	System.out.print(a[x]);*/
	    for(int t : a)
	    {
	    	System.out.print(t);
	    }
	}

}
