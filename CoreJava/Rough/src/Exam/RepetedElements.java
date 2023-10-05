package Exam;

public class RepetedElements {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,4,5,6,3};
		boolean b[]=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			count=0;
			if(b[x]==true)
			{
				continue;
			}
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y]&&x!=y)
				{
					count++;
					b[y]=true;
				}
			}
			if(count>0)
			{
				System.out.print(a[x]+" ");
			}
		}

	}

}
