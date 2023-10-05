package Rough;

public class StringReverse {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Rakesh");//hsekaR //HSEKAr
		String s2="Hello All Good MoRnInG";
//		hELLO aLL gOOD mOrNiNg
		System.out.println(s1.reverse());
		System.out.println(s1);
		String s3=new String(s1);
		int x;
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)>='a'&&s1.charAt(x)<='z')
			{
				System.out.print((char)(s1.charAt(x)-32));
			}
			else
			{
				System.out.print((char)(s1.charAt(x)+32));
			}
		}
		System.out.println();
		char a2[]=s2.toCharArray();
//		for(x=0;x<a2.length;x++)
//		{
//			System.out.print(a2[x]+" ");
//		}
//		for(x=0;x<a2.length;x++)
//		{
//			if(x>='A' && x<='Z')
//			{
//				System.out.print(((char)((a2[x])+32))+" ");
//			}
//			else 
//			{
//				System.out.print(((char)((a2[x])-32))+" ");
//			}
//		}
//		
		
				System.out.print(s2.toUpperCase());
			
			
				System.out.println();
				System.out.print(s2.toLowerCase());
			

	}

}
