
public class SelectionSort
{

	public static void main(String[] args) 
	{
		int a[]=new int[]{5,4,3,2,1};
	    int x,y;
	    for(x=0;x<a.length;x++)
	    {
	        System.out.println("x="+x);
	        int sm=x;
	        for(y=x+1;y<a.length;y++)
	        {
	            System.out.println("y="+y);
	            if(a[sm]>a[y])
	            {
	                sm=y;
	                System.out.println("sm="+sm);
	            }
	        }
	        int temp = a[sm];
	        System.out.println("temp="+temp);
	        a[sm]=a[x];
	        System.out.println("a[sm]="+a[sm]);
	        a[x]=temp;
	        System.out.println("a[x]="+a[x]);
	        for(int zz:a)
	        System.out.print(zz+" ");
	        System.out.println("\n------------------------------");
	    }
//		for(int zz:a)
//		{
//			System.out.println(zz);
//		}
		

	}

}
