package BO1_Strings;

public class Sub_String {

	public static void main(String[] args) {
		String s1=new String("Hello world");
		System.out.println(s1.length());
		
		System.out.println(s1.substring(6,11));
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());
		sb.append("helloisdu");
		System.out.println(sb.charAt(0));
		System.out.println(sb);

	}

}
