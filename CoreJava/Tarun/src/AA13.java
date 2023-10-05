
public class AA13 {

	public static void main(String[] args) {
		 //Printing only Duplicate Elements
	    int a[]=new int[]{1,2,3,2,1,45};
	    int x,y;
	    for(x=0;x<a.length;x++)
	    {
	        int count=0;
	        for(y=x+1;y<a.length;y++)
	        {
	            if(a[x]==a[y] && x!=y)
	            {
	                count++;
	                a[y]='_';
	            }
	        }
	        if(count>0 && a[x]!='_')
	        {
	            System.out.print(a[x]+" ");
	        }
	    }

	}

}
