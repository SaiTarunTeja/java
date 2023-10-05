package ArrayBasics;
import java.util.*;
public class UniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++)
		{
			int count=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(a[x]+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
