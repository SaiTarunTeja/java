
public class A4 {

	public static void main(String[] args) {
		int a[]=new int[] {12,19,21,7,44,65,9,11,32,4};
		int x,y,temp,count=0;
		for(x=0;x<a.length;x+=2)
		{
			count++;
		}
		
		int b[]=new int[count];
		
		for(x=0,y=0;x<a.length;x=x+2)
		{
			b[y]=a[x];
			y++;
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(b[x]+" ");
		}
		System.out.println("\n----------------------------\n");
		for(x=1;x<b.length;x++)
		{
			for(y=0;y<b.length-x;y++)
			{
				if(b[y]>b[y+1])
				{
					 temp=b[y];
					b[y]=b[y+1];
					b[y+1]=temp;
				}
			}
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(b[x]+" ");
		}
		System.out.println("\n----------------------------\n");
		int c[]=new int[count];
		for(x=1,y=0;x<a.length;x=x+2,y++)
		{
			c[y]=a[x];
		}
		for(x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}
		System.out.println("\n----------------------------\n");
		for(x=1;x<c.length;x++)
		{
			for(y=0;y<c.length-x;y++)
			{
				if(c[y]<c[y+1])
				{
					 temp=c[y];
					 c[y]=c[y+1];
					 c[y+1]=temp;
				}
			}
		}
		for(x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}
		int z;
		int d[]=new int[b.length+c.length];
		for(x=0,y=0,z=0;x<d.length;x++)
		{
			if(x%2==0)
			{
				d[x]=b[y];
				y++;
			}
			else if(x%2!=0)
			{
				d[x]=c[z];
				z++;
			}
			
		}
		System.out.println();
		for(x=0;x<d.length;x++)
		{
			System.out.print(d[x]+" ");
		}

	}

}
