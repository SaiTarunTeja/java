package ArrayBasics;
import java.util.*;
public class palindromers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("our array is ");
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		System.out.println("palindromes in this array is ");
		for(x=0;x<a.length;x++)
		{
			int rem,rev=0,temp=a[x];
			for(;temp>0;temp/=10)
			{
				rem=a[x]%10;
				rev=rev*10+rem;
			}
			if(rev==a[x])
			{
				System.out.println(a[x]);
			}
		}

	}

}
