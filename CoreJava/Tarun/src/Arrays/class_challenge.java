package Arrays;
import java.util.*;
public class class_challenge {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70};
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int x=b;x<a.length;x++)
		{
			System.out.print(a[x]);
		}
		for(int x=0;x<b;x++)
		{
			System.out.print(a[x]);
		}
	}
}
