package Exam;
import java.util.Scanner;
public class frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int len=sc.nextInt();
		int[] a=new int[len];
		boolean[] b=new boolean[a.length];
		System.out.println("Enter Array Elements");
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
	       a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++)
		{
			count=1;
			if(b[x]==true)
			continue;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					b[y]=true;
				}
			}
			if(count>=1)
			{
				System.out.println(a[x]+"-->"+count);
			}
		}

	}

}
