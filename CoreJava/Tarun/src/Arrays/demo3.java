package Arrays;
import java.util.*;
public class demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter elements in array");
		int x,insert,y=0;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("You entered elements are");
		for(x=0;x<a.length;x++)
		System.out.println(a[x]);
		System.out.println("__________________________________________________________________________________");
		System.out.println("Enter index number where you want to insert elements in an array");
		insert = sc.nextInt();
		
		System.out.println("You Entered"+insert);
		
		int b[]=new int[a.length];
		for(x=0;x<insert;x++)
		{
			b[y]=a[x];
			y++;
//			System.out.println(a[x]);
		}
		b[y]=sc.nextInt();
		for(x=a.length-1;x>insert;x--)
		{
			b[y]=a[x];
			y++;
//        	a[x]=a[x-1];
		}
		System.out.println("Enter elements you want to insert");
		a[insert]=sc.nextInt();
		for(int t: b)
		{
			System.out.println(t);
		}

	}

}
