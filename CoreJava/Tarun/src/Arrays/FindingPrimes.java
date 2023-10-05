package Arrays;

public class FindingPrimes {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		for(int x=0;x<a.length;x++)
		{
			int count=0;
		     for(int b=1;b<=a[x];b++)
		     {
			    if(a[x]%b==0)
			    {
			    	count++;
			    }
		     }
		     if(count==2)
		    	 System.out.println(a[x]);
		}

	}

}
