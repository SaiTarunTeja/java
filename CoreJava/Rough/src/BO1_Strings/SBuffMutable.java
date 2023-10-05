package BO1_Strings;

public class SBuffMutable {

	public static void main(String[] args) {
		System.out.println("String Buffer");
		StringBuffer sb1=new StringBuffer("Good");
		System.out.println(sb1+"==>"+sb1.hashCode());
		sb1=sb1.append("Morning");
		System.out.println(sb1+"==>"+sb1.hashCode());
		System.out.println();
		
//		System.out.println("String");
//		String s1=new String("Good");
//		System.out.println(s1+"==>"+s1.hashCode());
//		s1=s1.concat("Morning");
//		System.out.println(s1+"==>"+s1.hashCode());
//		System.out.println();
		
		System.out.println("String Builder");
		StringBuilder sbb1=new StringBuilder("Good");
		System.out.println(sbb1+"==>"+sbb1.hashCode());
		sbb1=sbb1.append("Morning");
		System.out.println(sbb1+"==>"+sbb1.hashCode());
	}

}
