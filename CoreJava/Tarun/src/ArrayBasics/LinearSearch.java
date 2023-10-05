package ArrayBasics;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of an array");
		int length = sc.nextInt();
		int a[]=new int[length];
        System.out.println("Enter Array Elements");
        int x;
        for(x=0;x<a.length;x++)
        {
        	a[x]=sc.nextInt();
        }
        System.out.println("array 'A' is");
        for(x=0;x<a.length;x++)
        {
        	System.out.print(a[x]+" ");
        }
        System.out.println("\nEnter Search Element");
        int search=sc.nextInt();
        boolean signal=false;
        int c=0,flag=0;
        for(x=0;x<a.length;x++)
        {
            if(search==a[x])
            {
            	flag=x;
            	signal=true;
            	c++;
            }
        }
        if(signal==true)
        {
        	System.out.println("Element found  "+c+" times "+"at "+flag+1+" index");
        }
        else
        {
        	System.out.println("Element not found");	
        }
        
        

	}

}
