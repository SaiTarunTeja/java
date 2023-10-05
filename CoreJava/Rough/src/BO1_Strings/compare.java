package BO1_Strings;

public class compare {

	public static void main(String[] args) {
		String s1=new String("RAVI");
		String s2=new String("RAVI");
		String s3=new String("Ravi");
		System.out.println(s1.compareTo(s2));//U-U==0
		System.out.println(s1.compareTo(s3));//A-a==-32
		System.out.println(s1.compareToIgnoreCase(s3));//ignore=0

	}

}
