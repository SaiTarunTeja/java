import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=1;x<a.length;x++)
		{
			for(y=0;y<a.length-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;			
				}
			}
		}
		for(int zz:a)
		{
			System.out.print(zz+" ");
		}
		// TODO Auto-generated method stub

	}

}
