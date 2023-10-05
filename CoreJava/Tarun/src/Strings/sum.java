package Strings;

public class sum {

	public static void main(String[] args) 
	{
		String s=new String("a1b2c3");
		String s1=new String("");
		int c=0;
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			c=0;
			s1="";
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
			
				s1=s1+s.charAt(i);
			}
			else {
				 c=Character.getNumericValue(s.charAt(i));
				 for( int k=0;k<c;i++)
					 System.out.println(s1.charAt(i));
			}


		}
	}

}
