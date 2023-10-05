
package Arrays;
import java.util.*;
public class Abc 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int len=sc.nextInt();//10
		System.out.println("enter array elements");
		int a[]=new int[len];//10
		int x,y,temp=0;
		for(x=0;x<len-1;x++)//9
		a[x]=sc.nextInt();
		System.out.println("enter position to insert");
		int pos=sc.nextInt();
		System.out.println("enter element to insert in "+pos+"position");
		int ele=sc.nextInt();
		for(x=a.length-1;x>pos;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=ele;
		for(int zz : a)
			System.out.println(zz + " ");

	}
}
