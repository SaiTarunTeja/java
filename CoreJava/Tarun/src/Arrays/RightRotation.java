package Arrays;
import java.util.*;
public class RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Of An Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Enter Rotational  Element");
		int b = sc.nextInt();
		System.out.println("So the output is");
		for(x=a.length-b;x<a.length;x++)
		{
			System.out.print(a[x]);
		}
		for(x=0;x<a.length-b;x++)
		{
			System.out.print(a[x]);
		}
	}

}
