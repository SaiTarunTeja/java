package ArrayBasics;

public class SelectionSortChanges {

	public static void main(String[] args) {
		// Selection Sort Changes
		int a[]=new int[]{45,67,93,45,25,32,12,2,5};
		int x,y;
		for(x=0;x<a.length;x++)
		{
		    int sn=x;
		    for(y=x+1;y<a.length;y++)
		    {
		        if(a[sn]<a[y])
		        {
		            sn=y;
		        }
		    }
		    int temp = a[sn];
		    a[sn]=a[x];
		    a[x]=temp;
		    for(int zz:a)
		    {
		        System.out.print(zz+" ");
		    }
		    System.out.println();
		}

	}

}
