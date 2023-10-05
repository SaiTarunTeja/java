package BO1_Strings;

public class a10b20c30 {

	public static void main(String[] args) {
		String s=new String("a10b20c30");
		char a[]=s.toCharArray();
		int x,y;
		int n=0;
		for(x=0;x<a.length;x++)
		{
			if(a[x]>='a'&&a[x]<='z'||a[x]>='A'&&a[x]<='Z')
			{
				n=0;
				for(y=x+1;y<a.length;y++)
				{
					if(a[y]>='0'&&a[y]<='9')
					{
					    n=n*10+Character.getNumericValue(a[y]);
					}
					else
						 break;
				}
				for(int z=0;z<n;z++)
				{
					System.out.print(a[x]);
				}
			}
		}

	}

}
