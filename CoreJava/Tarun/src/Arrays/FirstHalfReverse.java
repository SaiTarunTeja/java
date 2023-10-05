package Arrays;
import java.util.*;
public class FirstHalfReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y=0;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("First half Reverse");
		int b[]=new int[length];
		for(x=(a.length-1)/2;x>=0;x--)
		{
			b[y]=a[x];
			y++;
		}
		for(x=((a.length)/2);x<a.length;x++)
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
