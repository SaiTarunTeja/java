package BO1_Strings;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Any Name");
			String s1=sc.next();
			System.out.println("What character Do you want to search");
			char a1=sc.next().charAt(0);
			int count=0;
			for(int x=0;x<s1.length();x++)
			{
			    if(s1.charAt(x)==a1)
			    {
			        count++;
			    }
			}
			if(count==0)
		    {
			        System.out.println("Character Not Found");
			}
			else
			{
			        System.out.println("Character Found "+a1+" "+count);
			}

	}

}
