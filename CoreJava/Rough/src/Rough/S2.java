package Rough;

public class S2 {

	public static void main(String[] args) {
		String s1="HI";
		String s2="H1E2L6Li";
		String s3="a1b2c3";
		int x;
		int a=0;
//		for(x=0;x<s2.length();x++)
//		{
//			if(s2.charAt(x)>='0'&&s2.charAt(x)<='9')
//			{
//				a=a+Character.getNumericValue(s2.charAt(x));
//			}
//		}
//		System.out.println(a);
		int y;
		
		for(x=0;x<s3.length();x++)
		{
			if(s3.charAt(x)>='0'&&s3.charAt(x)<='9')
			{
				for(y=0;y<Character.getNumericValue(s3.charAt(x));y++)
				{
					System.out.print(s3.charAt(x-1));
				}
			}
		}

	}

}
