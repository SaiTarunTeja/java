package BO1_Strings;

public class A15b23c37 {

	public static void main(String[] args) {
		String s1=new String("A15b25c37");
		char[] a=s1.toCharArray();
		int x,y,n=0,z;
		for(x=0;x<a.length;x++)
		{
			if(a[x]>='A'&&a[x]<='z')
			{
				n=0;
				for(y=x+1;y<a.length;y++)
				{
					if(a[y]>='0' && a[y]<='9')
					{
						n=n*10+Character.getNumericValue(a[y]);
					}
					else
					{
						break;
					}
				}
				for(z=0;z<n;z++)
				{
					System.out.print(a[x]);
				}
			}
		}

	}

}
