package BO1_Strings;

public class DuplicateWords {

	public static void main(String[] args) {
		String s1=new String("Hello All All All");
		String[] a=s1.split(" ");
		boolean[] b=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			if(b[x]==true)
			continue;
			count=1;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x].equals(a[y]) && a[x]!=" ")
				{
					count++;
					b[y]=true;
				}
			}
			if(count==1)//unique words
			{
				System.out.println(a[x]+" "+count);
			}
			/*if(count>1)//duplicate words
			{
				System.out.println(a[x]+" "+count);
			}*/
			/*if(count>=1)//delete duplicate words
			{
				System.out.println(a[x]+" "+count);
			}*/
		}

	}

}
