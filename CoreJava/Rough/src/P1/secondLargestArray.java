package P1;

public class secondLargestArray {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,9,9,8};
		int x;
		int largest=a[0],second_largest=a[0];
		for(x=0;x<a.length;x++)
		{
			if(a[x]>largest)
			{
				largest=a[x];
			}
		}
		for(x=0;x<a.length;x++)
		{
			if(a[x]>second_largest && a[x]<largest)
			{
				second_largest=a[x];
			}
		}
		System.out.println(second_largest);
		

	}

}
