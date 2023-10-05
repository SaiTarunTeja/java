package Arrays;
import java.util.*;
public class SingleRightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of an array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		int temp=a[a.length-1];
		for(x=a.length-2;x>=0;x--)
		{
			a[x+1]=a[x];
			a[x]=temp;
		}
		for(int t:a)
		{
			System.out.print(t);
		}

	}

}
