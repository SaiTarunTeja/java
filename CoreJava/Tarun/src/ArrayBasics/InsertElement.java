package ArrayBasics;
import java.util.*;
public class InsertElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Enter index number where you want to insert");
		int index =sc.nextInt();
		System.out.println("Enter insert Element");
		int ele=sc.nextInt();
		for(x=a.length-1;x>index;x--)
		{
			a[x]=a[x-1];
		}
		a[index]=ele;
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		// TODO Auto-generated method stub

	}

}
