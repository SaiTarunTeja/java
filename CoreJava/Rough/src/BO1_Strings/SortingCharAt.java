package BO1_Strings;

public class SortingCharAt {

	public static void main(String[] args) {
	   String s=new String("apple");
	   int x,y;
	   for(x=65;x<=122;x++)
	   {
		   for(y=0;y<s.length();y++)
		   {
			   if((char)(x)==s.charAt(y))
				   System.out.println(s.charAt(y));
		   }
	   }

	}

}
