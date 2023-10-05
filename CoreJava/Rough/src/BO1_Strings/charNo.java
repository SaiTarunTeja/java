package BO1_Strings;

public class charNo {

	public static void main(String[] args) {
		String s1=new String("H123!@#ello Al&*(l Welco987me TO Coding HUb");
		int x,upper=0,lower=0,space=0,number=0,symbol=0;
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)>='A' && s1.charAt(x)<='Z')
			{
				upper++;
			}
			else if(s1.charAt(x)>='a' && s1.charAt(x)<='z')
			{
				lower++;
			}
			else if(s1.charAt(x)>='0' && s1.charAt(x)<='9')
			{
				number++;
			}
			else if(s1.charAt(x)==' ')
			{
				space++;
			}
			else
			{
				symbol++;
			}
		}
		System.out.println("Number of Upper Case letters = "+upper);
		System.out.println("Number of Lower Case letters = "+lower);
		System.out.println("numbers in String = "+number);
		System.out.println("Number of Spaces in String = "+space);
		System.out.println("Number of Symbols in String = "+symbol);

	}

}
