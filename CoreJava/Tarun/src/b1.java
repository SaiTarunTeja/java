import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
		// Find the unique Elements in the Array
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		int x,y,count;
		System.out.println("Enter Array Elements");
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		boolean b[]=new boolean[a.length];
		for(x=0;x<a.length;x++)
		{
			count=0;
			if(b[x]==true)
			{
				continue;
			}
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					 b[y]=true;
				}
			}
			if(count==0 && b[x]!=true)
			{
				System.out.print(a[x]+" ");
			}
		}

	}

}
