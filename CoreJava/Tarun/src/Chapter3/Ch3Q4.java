package Chapter3;

import java.util.Scanner;

public class Ch3Q4 {

	public static void main(String[] args) {
		// find the minimum and maximum element in the array
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter Array Length");
				int length = sc.nextInt();
				int a[]=new int[length];
				int x,y;
				System.out.println("Enter Elements in array");
				for(x=0;x<a.length;x++)
				{
					a[x]=sc.nextInt();
				}
				for(x=0;x<a.length;x++)
				{
					for(y=0;y<a.length-1;y++)
					{
						if(a[y]>a[y+1])
						{
							int temp=a[y];
							a[y]=a[y+1];
							a[y+1]=temp;
						}
					}
				}
				System.out.println("minimum element in array is "+ a[0]);
				System.out.println("maximum element in array is "+ a[a.length-1]);

	}

}
