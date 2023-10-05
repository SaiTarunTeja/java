package Exam;


public class CommanElements {

	public static void main(String[] args) {
		int a1[]=new int[] {1,2,3,4,4,5,6,3};
		int[] a2=new int[] {3,4};
		int x,y,count;
		for(x=0;x<a1.length;x++)
		{
			for(y=0;y<a2.length;y++)
			{
				if(a1[x]==a2[y])
				{
					System.out.println(a1[x]);
				}
			}
			
		}
	}
}
