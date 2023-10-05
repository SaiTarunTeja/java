package Chapter1;

public class Ch1Q9 {

	//sort the odd indexed Arrays in the ascending order and even indexed Array in 
	//decending order
//	12,56,34,23,67,76,32,75,90,345
//	90,67,34,32,12=even
//	23,56,75,76,345
	
		public static void main(String[] args) 
	    {
			int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
			int x,y;
			//normal sort
			for(x=0;x<a.length;x=x+2)
			{
				for(y=0;y<a.length;y=y+2)
				{
					if(a[x]>a[y])
					{
						int temp=a[x];
							a[x]=a[y];
							a[y]=temp;
					}
				}
			}
			for(x=1;x<a.length;x=x+2)
			{
				for(y=1;y<a.length;y+=2)
				{
					if(a[x]<a[y])
					{
						int temp=a[x];
						a[x]=a[y];
						a[y]=temp;
					}
				}
			}
			for(x=0;x<a.length;x++)
			{
				System.out.print(a[x]+" ");
			}
			System.out.println("\n--------------------------------");
			//selection sort
			int b[]=new int[] {12,56,34,23,67,76,32,75,90,345};
			for(x=0;x<b.length;x+=2)
			{
				int sn=x;
				for(y=x+2;y<b.length;y+=2)
				{
					if(b[sn]<b[y])
					{
						sn=y;
					}
				}
				int temp=b[sn];
				b[sn]=b[x];
				b[x]=temp;
			}
			for(x=1;x<b.length;x+=2)
			{
				int sn=x;
				for(y=x+2;y<b.length;y+=2)
				{
					if(b[sn]>b[y])
					{
						sn=y;
					}
				}
				int temp=b[sn];
				b[sn]=b[x];
				b[x]=temp;
			}
			for(x=0;x<b.length;x++)
			{
				System.out.print(b[x]+" ");
			}
			System.out.println("\n--------------------------------");
			//Bubble sort
			int c[]=new int[] {12,56,34,23,67,76,32,75,90,345};
			for(x=0;x<c.length;x++)
			{
				for(y=0;y<c.length-x-2;y+=2)
				{
					if(c[y]<c[y+2])
					{
						int temp=c[y];
						c[y]=c[y+2];
						c[y+2]=temp;
					}
				}
			}
			for(x=1;x<c.length;x++)
			{
				for(y=1;y<c.length-x-2;y=y+2)
				{
					if(c[y]>c[y+2])
					{
						int temp=c[y];
						c[y]=c[y+2];
						c[y+2]=temp;
					}
				}
			}
			for(x=0;x<c.length;x++)
			{
				System.out.print(c[x]+" ");
			}

		}

}
