package Arrays;
import java.util.*;
public class LastHalfReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StringLength");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y=0;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Last half reverse");
		int b[] = new int[length];
		for(x=0;x<a.length/2;x++)
		{
			b[y]=a[x];
			y++;
		}
		for(x=(a.length-1);x>=a.length/2;x--)
		{
			b[y]=a[x];
			y++;
		}
		for(int t:b)
		{
			System.out.print(t+" ");
		}
		

	}

}
