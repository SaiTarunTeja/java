package CRough;
import java.util.*;
public class String1 {

	public static void main(String[] args) {
		String[] s1=new String[] {"Sai","Tarun","Sai"};
		System.out.println(s1[0]+"==>"+s1[0].hashCode());
		System.out.println(s1[1]+"==>"+s1[1].hashCode());
		System.out.println(s1[2]+"==>"+s1[2].hashCode());
		
		System.out.println();
		
		String s2=new String("Sai");
		String s3=new String("Tarun");
		String s4=new String("Sai");
		System.out.println(s2+"==>"+s2.hashCode());
		System.out.println(s3+"==>"+s3.hashCode());
		System.out.println(s4+"==>"+s4.hashCode());
		
		System.out.println();
		
		String s5="Sai";
		System.out.println(s5+"==>"+s5.hashCode());
		
		ArrayList al=new ArrayList();
		al.add("Sai");
		System.out.println(al.get(0)+"==>"+al.get(0).hashCode());
	}

}
