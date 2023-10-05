package BO1_Strings;

public class Array_To_String {

	public static void main(String[] args) {
		A_to_S.arr_to_str();
		A_to_S.str_to_arr();
	}

}
class A_to_S
{
	public static void arr_to_str()
	{
		char[] a=new char[] {'A','S','T'};
		String s=new String(a);
		
		String s2=String.valueOf(a);
		System.out.println(s.charAt(0)+" "+" "+s2.charAt(2));
		
		StringBuilder sb = new StringBuilder();  
		for(char chars: a)   
		{    
			sb.append(chars);  
		}    
		String s4 = sb.toString();  
		System.out.println(s4.charAt(1));  
	}
	public static void str_to_arr()
	{
		String s=new String("asdf");
		char a[]=s.toCharArray();
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
	}
}