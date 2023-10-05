package Arrays;
import java.util.*;
public class CopyModel {

	public static void main(String[] args) {
		System.out.println("Enetr array length");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int a[]= new int[length];
		System.out.println("Enter Elements In Array");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Copy Array Is");
		int b[]=new int[a.length];
		for(x=0;x<a.length;x++)
		{
			b[x]=a[x];
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(b[x]+" ");
		}

	}

}
