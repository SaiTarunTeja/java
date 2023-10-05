package ArrayBasics;

public class BinarySearch2 {

	public static void main(String[] args) {
		//Binary Search With Selection Sort
		int a[]=new int[]{5,4,3,2,1};
	    int x,y;
	    for(x=0;x<a.length;x++)
	    {
	        int sn=x;
	        for(y=x+1;y<a.length;y++)
	        {
	            if(a[sn]>a[y])
	            {
	                sn=y;
	            } 
	        }
	        int temp = a[sn];
	        a[sn]=a[x];
	        a[x]=temp;
	    }
		for(x=0;x<a.length;x++)
		{
		    System.out.print(a[x]+" ");
		}
		
	
	int search=10;
	int l=0;
	int h=a.length-1;
	while(l<=h)
     	{
	         int  mid=(l+h)/2;
	             if(search==a[mid])
	             {
	               System.out.println("\nElement Found");
	               break;
	             }
	            if(search<a[mid])
	             {
	               h=mid-1;
	             }
	           if(search>a[mid])
	            {
	               l=mid+1;
	            }
      }
	 if(l>h)
     {
	    System.out.println("Element Not Found");
	    
	 }

	}

}
