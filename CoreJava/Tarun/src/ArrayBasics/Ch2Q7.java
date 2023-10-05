package ArrayBasics;
import java.util.*;
public class Ch2Q7 {

	public static void main(String[] args) {
//Write a program to print all the even indexed elements in ascending order and odd 
//		indexed elements in decending order
//		10 9 8 7 6 5 4 3 2 1 
//		1 2 3 4 5 6 7 8 9 10
//		1 10 3 8 5 6 7 4 9 2
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Length");
		int length = sc.nextInt();
		int a[]=new int [length];
		System.out.println("Enter Array Elements");
		int x,y,z;
		for(x=0;x<a.length;x+=2)
		{
			//for(y=0;y<)
		}
		/*for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=1;x<a.length;x++)
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
		for(x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		int b[]=new int[a.length/2];
		for(x=1,y=0;x<a.length;x+=2,y++)
		{
			b[y]=a[x];
		}
//		for(x=0;x<b.length;x++)
//		{
//			System.out.print(b[x]+" ");
//		}
		int c[]=new int[b.length];
		for(x=0,y=0;x<a.length;x+=2,y++)
		{
			c[y]=a[x];
		}
//		for(x=0;x<c.length;x++)
//		{
//			System.out.print(c[x]+" ");
//		}
		int d[]=new int [a.length];
		for(x=0,y=0,z=b.length-1;x<d.length;x++)
		{
			if(x%2==0)
			{
				d[x]=c[y];
				y++;
			}
			if(x%2!=0)
			{
				d[x]=b[z];
				z--;
			}
		}
		System.out.println();
		for(x=0;x<d.length;x++)
		{
			System.out.print(d[x]+" ");
		}
//		
//		for(x=0;x<d.length;x++)
//		{
//			System.out.print(d[x]+" ");
//		}
		/*for(x=0;x<a.length;x++)
		{
			
			/*if(x%2==0)
			{
			   for(x=0;x<a.length;x+=2)
			   {
			      int sn=x;
			      for(y=x+1;y<a.length;y++)
			      {
				     if(a[sn]>a[y])
				     {
					   sn=y;
				     }
			      }
			      int temp=a[sn];
			      a[sn]=a[x];
			      a[x]=temp;
		      }
			}
			
			if(x%2!=0)
			{
			   for(x=1;x<a.length;x+=2)
			   {
			      int sn=x;
			      for(y=x+1;y<a.length;y++)
			      {
				     if(a[sn]<a[y])
				     {
					   sn=y;
				     }
			      }
			      int temp=a[sn];
			      a[sn]=a[x];
			      a[x]=temp;
		      }
			}
		}
//		System.out.println();*/
		  

	}

}
