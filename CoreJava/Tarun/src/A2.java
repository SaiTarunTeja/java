
public class A2 {

	public static void main(String[] args) {
		//remove Duplicate Charector
		String s1=new String("Apple");
		String s2=new String("hello");
		//String s3=new String("");
		
		char a[]=s1.toCharArray();
		char k[]=new char[5];
		char b[]=s2.toCharArray();
//		char c[]=new char[a.length];
		int x,y,count;
		boolean c[]=new boolean[a.length];
		for(x=0;x<a.length;x++)
		{
			count=0;
			if(c[x]==true)
			{
				continue;
			}
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y]&&x!=y)
				{
					count++;
					c[y]=true;
				}
			}
			if(c[x]==false)
			{
				System.out.print(a[x]+" ");
			}
		}
		for(x=1;x<b.length;x++)
		{
			for(y=0;y<b.length-x;y++)
			{
				if(b[y]>b[y+1])
				{
					char temp=b[y];
					b[y]=b[y+1];
					b[y+1]=temp;
				}
			}
		}
		for(x=0;x<b.length;x++)
		{
			System.out.print(b[x]+" ");
		}
//		for(x=0,y=0;x<a.length;x++,y++)
//		{
//			c[y]=a[x];
//		}
//		for(char temp:c)
//		{
//			System.out.print(temp+" ");
//		}

	}

}
