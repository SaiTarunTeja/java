import java.util.*;
public class AAA1 {
//	odd index ascending order even index decending
	public static void main(String[] args) {
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int i,j;
		for(i=0;i<a.length;i=i+2)
		{
			for(j=0;j<a.length;j=j+2)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=1;i<a.length;i=i+2)
		{
			for(j=1;j<a.length;j=j+2)
			{
				if(a[i]<a[j]) 
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n------------------------------------\n");
//		selection sort
		int b[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(i=0;i<b.length;i=i+2)
		{
			int sn=i;
			for(j=i+2;j<b.length;j=j+2)
			{
				if(b[sn]<b[j])
				{
					sn=j;
				}
			}
			int temp=b[sn];
			b[sn]=b[i];
			b[i]=temp;
		}
		for(i=1;i<b.length;i=i+2)
		{
			int sn=i;
			for(j=i+2;j<b.length;j=j+2)
			{
				if(b[sn]>b[j])
				{
					sn=j;
				}
			}
			int temp=b[sn];
			b[sn]=b[i];
			b[i]=temp;
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print("\n------------------------------------\n");
		//bubble sort
		int c[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length-i-2;j+=2)
			{
				if(c[j]<c[j+2])
				{
					int temp=c[j];
					c[j]=c[j+2];
					c[j+2]=temp;
				}
			}
		}
		for(i=1;i<c.length;i++)
		{
			for(j=1;j<c.length-i-2;j+=2)
			{
				if(c[j]>c[j+2])
				{
					int temp=c[j];
					c[j]=c[j+2];
					c[j+2]=temp;
				}
			}
		}
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
		


