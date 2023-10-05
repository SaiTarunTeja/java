
public class SelectionSort1 {

	public static void main(String[] args) {
		int a[]=new int[] {45,37,29,47,23};
		int x,y,temp=0;
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
			temp=a[sn];
			   a[sn]=a[x];
			   a[x]=temp;
		}
		for(int temp1:a)
			System.out.println(temp1);
		// TODO Auto-generated method stub

	}

}
