package ArrayBasics;
import java.util.*;
public class RLRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Array 'A' is ");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println("\nleft rotation");
		System.out.println("Enter number of rotations for left rotation");
		int rotation=sc.nextInt();
		for(y=0;y<rotation;y++)
		{
		    int temp=a[0];
		    for(x=0;x<a.length-1;x++)
	     	{
			  a[x]=a[x+1];
		    }
		    a[x]=temp;
		}
		 System.out.println("After Left Rotation");
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println("Ringht Rotation");
		System.out.println("Enter number of rotations for left rotation");
		int rot=sc.nextInt();
		for(y=0;y<rot;y++)
		{
		int temp1=a[a.length-1];
		   for(x=a.length-1;x>0;x--)
		   {
			   a[x]=a[x-1];
		   }
		   a[0]=temp1;
		}
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
