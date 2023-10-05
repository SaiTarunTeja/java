package Exam;
import java.util.*;
public class SecondLargestWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String []a=s.split(" ");
		int l1=0;
		String word="";
		for(int x=0;x<a.length;x++)
		{
			int l2=a[x].length();
			if(l2>l1)
			{
				l1=l2;
				word=a[x];
			}
		}
		System.out.println(word);

	}

}
