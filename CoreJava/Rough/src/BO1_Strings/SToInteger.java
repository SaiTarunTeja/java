package BO1_Strings;
import java.lang.*;
public class SToInteger {

	public static void main(String[] args) {
		/*String s1="123";
		int i=Integer.parseInt(s1);
		System.out.println(i);
		int j=Integer.valueOf(s1);
		System.out.println(j);
		int x,sum=0,r;
		for(x=i;x>0;x/=10)
		{
			r=x%10;
			sum=sum+r;
		}
		System.out.println(sum);*/
		String s1=new String("a1b2c3");
		int x;
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)>='0'&&s1.charAt(x)<='9')
			{
				int i=Character.getNumericValue(s1.charAt(x));
				System.out.println(i);
			}
		}
		
	}

}
