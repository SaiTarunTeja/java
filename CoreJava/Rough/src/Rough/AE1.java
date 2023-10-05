package Rough;
import java.util.*;
public class AE1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("enter Elements in array");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
