package BO1_Strings;

public class charAt {

	public static void main(String[] args) {
		String s1=new String("Hello");
		int x;
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)>='A' && s1.charAt(x)<='z')
			{
				System.out.println(s1.charAt(x));
			}
		}

	}

}
