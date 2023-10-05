package Advance;

import java.util.ArrayList;

public class p1 {

	public static void main(String[] args) {
		Demo d=new Demo();
		String user="root";String password="root";
        String s1=d.init(user,password);
        System.out.println(s1);
        int [] z=d.call();
        for(int temp:z)
        {
        	System.out.print(temp+" ");
        }
        System.out.println();
        System.out.println(d.collect());	
     }

}
class Demo
{
	public String init(String user,String password)
	{
		String result=new String();
		result=user+password;
		return result;
	}
	public int[] call()
	{
		int[] x=new int[] {10,20,30};
		return x;
	}
	public ArrayList collect()
	{
		ArrayList al=new ArrayList();
		al.add(25);al.add("hello");al.add('c');
		return al;
	}
}