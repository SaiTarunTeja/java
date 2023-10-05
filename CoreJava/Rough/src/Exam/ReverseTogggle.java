package Exam;
import java.util.*;
public class ReverseTogggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Sentence");
//		String s1=sc.nextLine();
		String s1="Hello All Good MoRnInG";
		String s2[]=s1.split(" ");
		int x;
		for(x=0;x<s1.length();x++)
		{
				
			char i=s1.charAt(x);
			if(i>='a'&& i<='z')
			{
				char j=Character.toUpperCase(i);
				System.out.print(j+" ");
			}
			else
			{
				char k=Character.toLowerCase(i);
				System.out.print(k+" ");
			}
			
		}
		
		
	}

}
