package Chapter1;

public class Ch1Q5a {

	//Print the Array in the Reverse Order
		public static void main(String[] args) {
	            int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
	            int x;
	            for(x=a.length-1;x>=0;x--)
	            {
	            	System.out.print(a[x]+" ");
	            }
	            System.out.println("\nAnother Method");
	            int b[]=new int[a.length];
	            int y=0;
	            for(x=a.length-1;x>=0;x--)
	            {
	            	b[y]=a[x];
	            	y++;
	            }
	            for(int t:b)
	            {
	            	System.out.print(t+" ");
	            }
		}

}
