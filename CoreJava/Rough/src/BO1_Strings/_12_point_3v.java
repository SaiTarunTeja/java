package BO1_Strings;

public class _12_point_3v extends ConvertDouble {
//convert String "12.3v" into double value 12.3
	public static void main(String[] args) {
	
		_12_point_3v d= new _12_point_3v();
			d.m1();

		}
	}
	class ConvertDouble
	{
		void m1()
		{
		    System.out.println("m1");
		    String s1=new String("12.3v");
		    String s2="";
		    for(int x=0;x<s1.length();x++)
		    {
			   if(!Character.isAlphabetic(s1.charAt(x)))
				  s2=s2+s1.charAt(x);			 
		    }
		    System.out.println(s2);
		    double d=Double.valueOf(s2);
		    System.out.println(d);
		    System.out.println(d+2);		 
		}		
	}