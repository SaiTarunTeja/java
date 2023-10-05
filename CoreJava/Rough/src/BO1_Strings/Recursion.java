package BO1_Strings;

public class Recursion {

	public static void main(String[] args) 
	{
		String s="hello";
		String rev="";
		
		System.out.println(palin(s,rev,s.length()-1));
	}
	public static String palin(String a,String rev,int l)//hello    4
	{
		if(a.isEmpty()||l<0)
			return "";
		else {
				return rev=rev+a.charAt(l)+palin(a,rev,l-1);
				//             o+palin(hello,o,3)
				//             ol+palin(hello,ol,2)
		}
	}
	protected void finalize() throws Throwable
	{
	    // finalization code here.
	}

}
