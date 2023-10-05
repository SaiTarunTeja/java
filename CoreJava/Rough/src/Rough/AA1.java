package Rough;
import java.util.*;
public class AA1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
			v.add(i);
	     char s1 = 'a';
	     int s2 = (int)(s1);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
//			Integer i=(Integer)e.nextElement();
//			if(i%2==0)
				System.out.print(e.nextElement());//0,2,4,,6,8,10
		}
	}
}
