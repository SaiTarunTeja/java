package Chapter3;

import java.util.Scanner;

public class Ch3Q8 {

	public static void main(String[] args) {
//		Remove the duplicate elements in the array
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of Array");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		boolean b[]=new boolean[a.length];
		for(x=0;x<a.length;x++)
		{
			count=1;
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
			if(count>0 )
			{
				System.out.print(a[x]+" ");
			}
			System.out.println();
		}

	}

}
