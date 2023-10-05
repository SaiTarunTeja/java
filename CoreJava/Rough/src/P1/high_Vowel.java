package P1;

public class high_Vowel {

	public static void main(String[] args) {
		String s1="Happy New Year AEIOU aeio";
		String[] a=s1.split(" ");
		int x,count1=0,count2=0;
		for(x=0;x<a[0].length();x++)
		{
			String s2=a[0];
			if(s2.charAt(x)=='a' || s2.charAt(x)=='e' || s2.charAt(x)=='i' || s2.charAt(x)=='o' || s2.charAt(x)=='u')
			{
				count1++;
			}
		}
	
		String highest=a[0];
		for(x=0;x<a.length;x++)
		{
			String s3=a[x];
			if(s3.charAt(x)=='a' || s3.charAt(x)=='e' || s3.charAt(x)=='i' || s3.charAt(x)=='o' || s3.charAt(x)=='u')
			{
				count2++;
			}
		
		    if(count2>count1)
	    	{
			   highest=a[x];
		    }
		}
		System.out.println(highest);
        
        
	}
	

}
