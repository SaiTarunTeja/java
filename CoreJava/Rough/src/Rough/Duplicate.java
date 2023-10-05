package Rough;

public class Duplicate {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,2,1};
		int i,j,count=0;
		for(i=0;i<a.length;i++)
		{
			
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				
				System.out.println(a[j]);
			}
		}

	}

}
