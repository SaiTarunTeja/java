package String;
import java.util.*;
public class UpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		int x;
		/*for(x=0;x<s1.length();x++)
		{
			char i=s1.charAt(x);
			if(i>='A'&&i<='Z')
			{
				char j=Character.toLowerCase(i);
				System.out.print(j+" ");
			}
			else
			{
				char k=Character.toUpperCase(i);
				System.out.print(k+" ");
			}
		}*/
		
		/*char a[]=s1.toCharArray();
		for(x=0;x<a.length;x++)
		{
			if(a[x]>='A'&&a[x]<='Z')
			{
				a[x]=Character.toLowerCase(a[x]);
				System.out.print(a[x]+" ");
			}
			else
			{				
				a[x]=Character.toUpperCase(a[x]);
				System.out.print(a[x]+" ");
			}
		}*/
		
		char s2[]=s1.toCharArray();
		for(x=0;x<s2.length;x++)
		{			
			if(s2[x]>='a'&&s2[x]<='z')
			{				
				s2[x]=(char)((int)s2[x]-32);
			}
			else if(s2[x]>='A'&&s2[x]<='Z')
			{
				s2[x]=(char)((int)s2[x]+32);
			}			
		}
		for(x=0;x<s2.length;x++)
		{
			System.out.print(s2[x]);
		}

	}

}
