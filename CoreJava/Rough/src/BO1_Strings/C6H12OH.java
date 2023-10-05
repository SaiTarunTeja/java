package BO1_Strings;

public class C6H12OH {

	public static void main(String[] args) {
		String s=new String("C6H12OH");
		char a[]=s.toCharArray();
		int x,y,z,n,sum=0;
		for(x=0;x<a.length;x++)
		{
			n=0;
			if(a[x]>='A' && a[x]<='z')
			{
				for(y=x+1;y<a.length;y++)
				{
					if(a[y]>='0' && a[y]<='9')
					{
						n=n*10+Character.getNumericValue(s.charAt(y));
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
