package ArrayBasics;
import java.util.*;
public class Ch5Q5 {

	public static void main(String[] args) {
		// Insert 67 in 5 th position of array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter array elements");
		int x;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Enter index number where you want to insert Element");
		int position=sc.nextInt();
		System.out.println("Enter Element");
		int element=sc.nextInt();
		for(x=0;x<position;x++)
		{
			System.out.print(a[x]+" ");
		}
		a[position]=element;
		for(x=a.length-1;x>position;x--)
		{
			a[x]=a[x-1];
		}
		for(x=position+1;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}

	}

}
