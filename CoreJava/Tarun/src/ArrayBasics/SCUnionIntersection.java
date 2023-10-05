package ArrayBasics;
import java.util.*;
public class SCUnionIntersection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 'a[]' Array length");
		int length=s.nextInt();
		int a[]=new int[length];
		System.out.println("Enter 'a[]' Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=s.nextInt();
		}
		System.out.println("Enter 'b[]' Array length");
		int lengt=s.nextInt();
		int b[]=new int[lengt];
		System.out.println("Enter 'b[]' Array Elements");
		for(x=0;x<a.length;x++)
		{
			b[x]=s.nextInt();
		}
		

	}

}
