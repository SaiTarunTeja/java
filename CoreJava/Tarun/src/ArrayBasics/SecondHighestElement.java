package ArrayBasics;

public class SecondHighestElement {

	public static void main(String[] args) {
		// Find smallest and second highest element of the below array
       //a[]={1,5,6,4,5,6,9,9}
		int a[]=new int[] {1,5,6,4,5,6,9,9};
		boolean b[]=new boolean[a.length];
		int c[]=new int[a.length];
		int x,y,count,count2=0,k=0;
		for(x=0;x<a.length;x++)
		{
			count=1;
		   if(b[x]==true)
		   {
			   continue;
		   }
		   for(y=0;y<a.length;y++)
		    {
			    if(a[x]==a[y] && x!=y)
			    {
				  count++;
				  b[y]=true;
			    }
		    }
		    if(count>=0)   
		    {
			 c[count2]=a[x];
			  count2++;  
		    }
		}
		for(x=1;x<count2;x++)
		   {
			  for(y=0;y<count2-x;y++)
			  {
				  if(c[y]>c[y+1])
				  {
					  int temp=c[y];
					  c[y]=c[y+1];
					  c[y+1]=temp;
				  }
			  }
		   }
		for(x=0;x<count2;x++)
		{
			System.out.print(c[x]+" ");
		}
		System.out.println("\n"+c[count2-2]+" is the second largest element");
		System.out.println(c[0]+" is the Smallest element");

	}

}
