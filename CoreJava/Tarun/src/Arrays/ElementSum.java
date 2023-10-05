package Arrays;

public class ElementSum {

	public static void main(String[] args) {
	   int a[]=new int[] {1,2,3,4,5,6,7,8,9};
	   int sum=0;
	   for(int x=0;x<a.length;x++)
	   {		
		   sum=sum+a[x];
	   }
	   System.out.println(sum);
	}

}
