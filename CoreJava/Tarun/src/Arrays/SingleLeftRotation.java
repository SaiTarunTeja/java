package Arrays;
import java.util.*;
public class SingleLeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of an array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter elements in array");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		int temp=a[0];
		for(x=1;x<a.length;x++)
		{
			a[x-1]=a[x];
			a[x]=temp;
		}
		for(int z:a)
		{
			System.out.print(z);
		}

	}

}
