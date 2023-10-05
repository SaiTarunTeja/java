package ArrayBasics;
import java.util.*;
public class DeleteElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
			System.out.println("Enter index number to delete element");
			int delete=sc.nextInt();
			for(x=delete;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			for(x=0;x<a.length;x++)
			{
				System.out.print(a[x]+" ");
			}
	}

}
