package BO1_Strings;
import java.util.*;
public class DotEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s1 =new String("Hello").intern();
		String s2 ="Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

	}

}
