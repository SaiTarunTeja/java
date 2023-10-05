package BO1_Strings;

public class a1b2c3 {

	public static void main(String[] args) {
		String s=new String("a5b7c3");
		int x,y;
		/*for(x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='0' && s.charAt(x)<='9')
			{
				for(y=0;y<Character.getNumericValue(s.charAt(x));y++)
				{
					System.out.print(s.charAt(x-1));
				}
			}
		}*/
		char a[]=s.toCharArray();
		for(x=0;x<a.length;x++)
		{
			if(a[x]>='0' && a[x]<='9')
			{
				for(y=0;y<Character.getNumericValue(s.charAt(x));y++)
				{
					System.out.print(a[x-1]);
				}
			}
		}

	}

}
