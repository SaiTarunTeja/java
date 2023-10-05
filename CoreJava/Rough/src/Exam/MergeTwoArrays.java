package Exam;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[] {5,6,7,8};
		int c[]=new int[a.length+b.length];
		int x,y,z;
		for(x=0,y=0;x<=(c.length-1)/2;x++,y++)
		{
			c[y]=a[x];
		}
		for(x=0,z=((c.length-1)/2)+1;z<c.length;x++,z++)
		{
			c[z]=b[x];
		}
		for(x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}

	}

}
