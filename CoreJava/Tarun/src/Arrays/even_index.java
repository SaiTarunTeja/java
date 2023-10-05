package Arrays;

public class even_index {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("even index numbers");
		for(int x=0;x<a.length;x=x+2) 
		{
		System.out.print(a[x]+" ");
		}
		System.out.print("\n odd index numbers \n");
		for(int x=1;x<a.length;x=x+2) 
		{
			System.out.print(a[x]+" ");
		}
	}

}
