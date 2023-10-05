package Rough;

import java.util.*;

public class S1 {

	public static void main(String[] args) {
		String a1=new String("LISTEN");
		String a2=new String("SILENT");
		char a11[]=a1.toCharArray();
		char a21[]=a2.toCharArray();
		int x,y;
		
//		boolean k=false;
	     Arrays.sort(a11);
	     Arrays.sort(a21);
	    if(a11.length==a21.length)
	    {
	    	if(Arrays.equals(a11, a21))
	    		System.out.println("anagram");
	    	else
	    		System.out.println("not anagram");
	    }
	    else
	    	System.out.println("can't compare");

	}

}
