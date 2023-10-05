
public class UniqueElements {

	public static void main(String[] args) {
		int a[]=new int[] {1,3,2,1,2,4,5,6};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			int count=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[x]);
			}
		}
			
		// TODO Auto-generated method stub

	}

}
