package Arrays;

public class HalfReverse {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,};
        for(int x=a.length-1;x>a.length/2;x--)
        {
        	System.out.print(a[x]+" ");
        }
        for(int x=0;x<=(a.length-1)/2;x++)
        {
        	System.out.print(a[x]+" ");
        }
        System.out.println("\n");
        for(int x=0;x<=(a.length-1)/2;x++)
        {
        	System.out.print(a[x]+" ");
        }
        System.out.println("\n");
        for(int x=((a.length-1)/2)+1;x<a.length;x++)
        {
        	System.out.print(a[x]+" ");
        }
	}

}
