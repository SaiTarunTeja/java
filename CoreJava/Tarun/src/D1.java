
public class D1 {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,2,1};
		boolean b[]=new boolean[a.length];
		int x,y;
		for(x=0;x<a.length;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(y=0;y<a.length;y++)
			{
				if(a[y]==a[x]&&x!=y)
				{
					count++;
					b[y]=true;
				}
			}
			//unique elements
			if(count>1&&b[x]==false)
			{
				System.out.print(+a[x]+" "+count+"\n");
			}
			
			//duplicate elements
			/*if(count>1)
			{
				System.out.print(a[x]+" "+count+"\n");
			}*/
			//delete duplicate elements
			/*if(count>0)
			{
				System.out.print(a[x]+" "+count+"\n");
			}*/
		}
		// TODO Auto-generated method stub

	}

}
