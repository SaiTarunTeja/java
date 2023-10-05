
public class AA12 {

	public static void main(String[] args) {
		 int a[]=new int[]{1,2,3,1,2,4,5,95};
		    int x,y;
		    for(x=0;x<a.length;x++)
		    {
		        int count=0;
		        for(y=0;y<a.length;y++)
		        {
		            if(a[x]==a[y]&&x!=y)
		            {
		                count++;
		                a[y]='_';
		            }
		        }
		        if(a[x]!='_')
		        {
		            System.out.print(a[x]+" ");
		        }
		    }

	}

}
