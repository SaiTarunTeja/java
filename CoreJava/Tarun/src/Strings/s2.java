package Strings;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("He38l&*^%$lo Al!~#l Go od Morn4384r8ing");
		int x,upper=0,lower=0,n=0,space=0,symbol=0;
		for(x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='A'&&s.charAt(x)<='Z')
			{
				upper++;
			}
			else if(s.charAt(x)>='a'&&s.charAt(x)<='z')
			{
				lower++;
			}
			else if(s.charAt(x)>='0'&&s.charAt(x)<='9')
			{
				n++;
			}
			else if(s.charAt(x)==' ')
			{
				space++;
			}
			else
			{
				symbol++;
			}
		}
		System.out.println("Upper Case letter in String is "+upper);
		System.out.println("Lower Case letter in String is "+lower);
		System.out.println("numbers in String is "+n);
		System.out.println("Spsces in String is "+space);
		System.out.println("Symbols in String is "+symbol);

	}

}
