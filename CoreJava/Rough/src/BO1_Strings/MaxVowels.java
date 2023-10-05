package BO1_Strings;

public class MaxVowels {

	public static void main(String[] args) {
		String s1=new String("Happy New Year aaa");
		String[] a=s1.split(" ");
		String Mvowel="";
		int x,y,count1=0,count=0;
		
		for(x=0;x<a.length;x++)
		{
			String s2=a[x];
			count1=0;
			for(y=s2.length()-1;y>=0;y--)
			{
				if(s2.charAt(x)=='a' || s2.charAt(x)=='e' || s2.charAt(x)=='i' || s2.charAt(x)=='o' || s2.charAt(x)=='u')
			    count1++;
			}
			
			if(count1>count)
			{
				Mvowel=a[x];
			}
			
		}
		System.out.println(Mvowel);
	}

}
