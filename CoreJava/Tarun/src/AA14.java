
public class AA14 {

	public static void main(String[] args) {
		 int a[]=new int[]{10,20,30,10,20,40,50,70,30,95};
		    int count=0,x,y;
		    for(x=0;x<a.length;x++)
		    {
		        count=0;
		        for(y=0;y<a.length;y++)
		        {
		            if(a[x]==a[y] && x!=y)
		            {
		                count++;
		           //     break;
		                   a[y]='_';
		            }
		        }
		        if(count>0&&a[x]!='_')
		        {
		            System.out.print(a[x]+" ");
		        }
		    }

	}

}
