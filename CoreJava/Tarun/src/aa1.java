
public class aa1 {

	public static void main(String[] args) {
		int a[]=new int[]{143,65,98,3,23};
		int x,y;
	    for( x=0;x<a.length;x++)
	    {
	        int min = x;
	        for( y=x+1;y<a.length;y++)
	        {
	            if(a[min]<a[y])
	            {
	                min = y;
	            }
	           
	        }
	        int temp=a[min];
            a[min]=a[y];
            a[y]=temp;
	    }
	    for( x=0;x<a.length;x++)
	    {
		System.out.println(a[x]);
	    }

	}

}
