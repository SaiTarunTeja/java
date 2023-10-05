package BO1_Strings;

public class High_vowel {

	public static void main(String[] args) {
		String s1="Wish aeaeaea you happy new year ";
		String[] a=s1.split(" ");
		
		int x,count1=0,count2=0,count3=0;
		
		String high="";
		for(x=0;x<a.length;x++)
		{
			String s3=a[x];
			count2=0;
			for(int y=0;y<s3.length();y++)
			{
			    if(s3.charAt(y)=='a' || s3.charAt(y)=='e' || s3.charAt(y)=='i' ||s3.charAt(y)=='o' ||s3.charAt(y)=='u')
			    {
				    count2++;
			    }
			}
			
			if(count2>count3)
			{
				count3=count2;
				high=a[x];
			}
			
		}
		System.out.println(high);

	}

}
