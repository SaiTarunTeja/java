package Arrays;

public class demo2 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int x,y;
		int r=3;
		for(y=0;y<r;y++)
		{
		     int temp=a[a.length-1];
		     //for(x=a.length-1;x>0;x--)
		    	 for(x=a.length-2;x>=0;x--)
		     {
//			   a[x]=a[x-1];
		    	 a[x+1]=a[x];
		    	
		     }
	          a[0]=temp;
		}
	    for(int zz:a)
	    {
	    	System.out.print(zz+"  ");
	    }
	}
}
	
	


