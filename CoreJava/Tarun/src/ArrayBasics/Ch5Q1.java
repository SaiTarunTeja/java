package ArrayBasics;
import java.util.*;
public class Ch5Q1 {

	public static void main(String[] args) {
		// Rigth rotate 5 times using 2 loops O(n2) complexity
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Enter Rotation number");
		int rotation =sc.nextInt();
		for(y=0;y<rotation;y++)
		{
			int temp=a[a.length-1];
			for(x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[0]=temp;
		}
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
