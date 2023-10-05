package Chapter1;

public class Ch1Q8 {

	
		//Divide the Array in two equal halfs first half is ascinding and remaining decinding
		public static void main(String[] args) {
			int i[]=new int[] {12,56,34,23,67,76,32,75,90,345};
			int count=0,x,y,z,count1=0;
			for(int zz:i)
			{
				count1++;
			}
			System.out.println(count1);
			for(x=0;x<count1/2;x++)
			{
				for(y=0;y<(count1/2)-x;y++)
					{
						if(i[y]>i[y+1])
						{
							int temp=i[y];
							i[y]=i[y+1];
							i[y+1]=temp;
						}
					}
			}
			for(x=(count1)/2;x<count1;x++)
			{
				//this is not working
				for(y=(count1)/2;y<count1-x;y++)
				{
					if(i[y]<i[y+1])
					{
						System.out.println("hi");
						int temp=i[y];
						i[y]=i[y+1];
						i[y+1]=temp;
					}
				}				
			}			
			for(x=0;x<i.length;x++)
			{
				System.out.print(i[x]+" ");
			}
			int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
			
			for(int zz:a)
			{
				count++;
			}
			System.out.println("\nArray length is "+count);
			int b[]=new int[count/2];
			for(x=0,y=0;x<a.length/2;x++,y++)
			{
				b[y]=a[x];
			}
			for(x=0;x<b.length;x++)
			{
				System.out.print(b[x]+" ");
			}
			System.out.println();
			for(x=1;x<b.length;x++)
			{
				for(y=0;y<b.length-x;y++)
				{
					if(b[y]>b[y+1])
					{
						int temp=b[y];
						b[y]=b[y+1];
						b[y+1]=temp;
					}
				}
			}
			for(x=0;x<b.length;x++)
			{
				System.out.print(b[x]+" ");
			}
			System.out.println();
			int c[]=new int[count/2];
			for(x=(((a.length-1)/2)+1),y=0;x<a.length;x++,y++)
			{
				c[y]=a[x];
			}
					
			for(x=1;x<c.length;x++)
			{
				for(y=0;y<c.length-x;y++)
				{
					if(c[y]<c[y+1])
					{
						int temp=c[y];
						c[y]=c[y+1];
						c[y+1]=temp;
					}
				}
			}
			for(x=0;x<c.length;x++)
			{
				System.out.print(c[x]+" ");
			}
			int d[]=new int[a.length];
			for(x=0,y=0;x<d.length/2;x++,y++)
			{
				d[y]=b[x];
			}
			for(x=0,y=(((d.length-1)/2)+1);y<d.length;x++,y++)
	        {
	        	d[y]=c[x];
	        }

			System.out.println();
			for(x=0;x<d.length;x++)
			{
				System.out.print(d[x]+" ");
			}

	}

}
