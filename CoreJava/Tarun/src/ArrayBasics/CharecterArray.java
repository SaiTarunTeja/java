package ArrayBasics;
import java.util.*;
public class CharecterArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array length");
		int length =sc.nextInt();
		char a[]=new char[length];
		System.out.println("Enter Elements in an Array");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.next().charAt(0);
		}
		System.out.println("our array is ");
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
				

	}

}
