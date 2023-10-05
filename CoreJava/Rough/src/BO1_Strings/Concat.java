package BO1_Strings;

public class Concat {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		//Model 1
		System.out.println(s1.concat("All"));
		//Model 2
		String s2 = new String ("All");
		System.out.println(s1.concat(s2));
		//Model 3
		System.out.println(s1+s2);
		//Model 4
		s1=s1.concat("All");
		System.out.println(s1);
	}

}
