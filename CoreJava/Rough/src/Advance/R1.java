package Advance;

import java.util.Arrays;

public class R1 {

	public static void main(String[] args) {
		String s1=new String("hello all");
		String[] s2=s1.split(" ");
		for(int x=0;x<s2.length;x++)
		{
		    String s3=s2[x];
//		    if(true)
//		    {
		        System.out.print((char)(s3.charAt(0)-32));
//		    }
//		    else
//		    {
		        System.out.print(s3.substring(1)+" ");
//		    }
		

		}
	}

}
