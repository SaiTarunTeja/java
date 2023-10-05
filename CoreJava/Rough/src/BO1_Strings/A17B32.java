package BO1_Strings;

public class A17B32 {

	public static void main(String[] args) {
		String s1=new String("A17B32");
		char a[]=s1.toCharArray();
		int x,y,n,z;
		for(x=0;x<a.length;x++)
		{
			n=0;
			if(a[x]>='A' && a[x]<='Z')
			{
				for(y=x+1;y<a.length;y++)
				{
					if(a[y]>='0' && a[y]<='9')
					{
						n=n*10+Character.getNumericValue(s1.charAt(y));
					}
					else
						break;
				}
				for(z=0;z<n;z++)
				{
					System.out.print(a[x]);
				}
			}
		}

	}

}
