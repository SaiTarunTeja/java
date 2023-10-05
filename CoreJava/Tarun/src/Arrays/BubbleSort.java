package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]=new int[] {546,789,7,543,321};
		int n = a.length;
		for(int x=1;x<a.length;x++)
		{
			for(int j=0;j<a.length-x;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		for(int x=0;x<a.length;x++)
		System.out.print(a[x]+" ");
		// TODO Auto-generated method stub

	}

}
