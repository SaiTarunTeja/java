package Rough;
import java.util.Scanner;
public class hiiii {

	private static void main(String[] args) {
		String s1="hello all good morning";
		System.out.println(s1);
		String s2=new String("hello all good morning");
		System.out.println(s2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s3=sc.nextLine();
		String s4[]=s3.split(" ");
		for(String zz:s4)
		{
			System.out.println(zz+" ");
		}

	}

}
