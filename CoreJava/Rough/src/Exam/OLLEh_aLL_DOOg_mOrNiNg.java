package Exam;

public class OLLEh_aLL_DOOg_mOrNiNg 
{
	public static void main(String[] args) 
	{
		String s1=new String("Hello All Good MoRnInG");
		String[] a=s1.split(" ");
		int x,y;
		String s3=new String("");
		for(x=0;x<a.length;x++)
		{
			String s2=new String("");
			if(x%2==0)
			{
			   for(y=a[x].length()-1;y>=0;y--)
			   {
				  s2=s2+a[x].charAt(y);	
			   }
			}
			else
			{
				for(y=0;y<a[x].length();y++)
				   {
					  s2=s2+a[x].charAt(y);	
				   }
			}
			s3=s3+s2+" ";
		}
		System.out.println(s3);
		for(x=0;x<s3.length();x++)
		{
			if(s3.charAt(x)>='a' && s3.charAt(x)<='z')
			{
				System.out.print((char)(s3.charAt(x)-32));
			}
			else if(s3.charAt(x)>='A' && s3.charAt(x)<='Z')
			{
				System.out.print((char)(s3.charAt(x)+32));
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
}
