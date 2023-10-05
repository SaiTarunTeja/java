package BO1_Strings;

public class Words_Number {

	public static void main(String[] args) {
		String s1= new String("Hello All Welcome To Coding Hub");
		System.out.println("Number of Charecters in String= "+s1.length());
		String s2[]=s1.split(" ");
		System.out.println("Number of words in String= "+s2.length);

	}

}
