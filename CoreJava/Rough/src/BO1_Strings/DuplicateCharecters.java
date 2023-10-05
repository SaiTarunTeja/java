package BO1_Strings;

public class DuplicateCharecters {

	public static void main(String[] args) {
		String s1=new String("Sai Tarun Teja");
		char a[]=s1.toCharArray();
		boolean b[]=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			if(b[x]==true)
			continue;
			count=1;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y] && a[x]!=' ')
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1 && b[x]!=true)
			{
				System.out.println(a[x]+" "+count);
			}
		}
		

	}

}
