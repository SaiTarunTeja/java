package ArrayBasics;

public class SelectionSortExplanation {

	public static void main(String[] args) {
//		      Selection Sort Explanation
		int a[]=new int[]{5,4,3,2,1};
	    int x,y;
	    for(x=0;x<a.length;x++)
	    {
	    	boolean k=false;
	    	System.out.println("boolean k= "+k);
	        System.out.println("x="+x);
	        int sm=x;
	        System.out.println("sm= "+sm);
	        for(y=x+1;y<a.length;y++)
	        {
	            System.out.println("y="+y);
	            if(a[sm]>a[y])
	            {
	            	k=true;
	            	System.out.println("k= "+k);
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

	}

}
