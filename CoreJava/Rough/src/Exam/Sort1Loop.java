package Exam;

public class Sort1Loop {

	public static void main(String[] args) {
		int a[]=new int[] {4,9,3,6,2,4,1};
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		for(int zz:a)
			System.out.print(zz+",");
	}

}
