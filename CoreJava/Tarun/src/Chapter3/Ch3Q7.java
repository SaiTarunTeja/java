package Chapter3;

import java.util.Scanner;

public class Ch3Q7 {

	public static void main(String[] args) {
		// print frequency of the all the elements in the array
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter length of array");
				int length=sc.nextInt();
				int a[]=new int[length];
				int x,y,count;
				System.out.println("Enter Array elements");
				for(x=0;x<a.length;x++)
				{
					a[x]=sc.nextInt();
				}
				boolean b[]=new boolean [a.length];
				for(x=0;x<a.length;x++)
				{
					count=1;
					if(b[x]==true)
					{
						continue;
					}
					for(y=0;y<a.length;y++)
					{
						if(a[x]==a[y]&&x!=y)
						{
							count++;
							b[y]=true;
						}
					}
					if(count>=1)
					{
						System.out.print(a[x]+" "+count);
					}
					System.out.println();
				}

	}

}
