package VignanArrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,2,1};
		boolean b[]=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			if(b[x]==true)
			continue;
			count=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					b[y]=true;
				}
			}
			if(count>0)
			{
				System.out.println(a[x]+" "+(count+1));
			}
		}

	}

}
