package BO1_Strings;

public class abbccc {

	public static void main(String[] args) {
		String s1=new String("abbccc");
		char[] a=s1.toCharArray();
		boolean[] b=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			if(b[x]==true)
			continue;
			count=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
			{
				System.out.print(a[x]+""+"");
			}
		}
		/*String s=new String("abbccc");
		char[] a=s.toCharArray();
		int x,count=1;
		for(x=0;x<a.length-1;x++)
		{
			if(a[x]==a[x+1]&&x!=x+1)
			{
				count++;
				a[x+1]='0';
			}
			if(a[x]!='0')
			{
				System.out.print(a[x]+""+count+"");
			}
			
		}*/

	}

}
