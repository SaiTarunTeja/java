package BO1_Strings;

public class substring {

	public static void main(String[] args) {
		String s1=new String("Hello");
		int x,y;
		for(x=0;x<s1.length();x++)
		{
			for(y=x+1;y<=s1.length();y++)
			{
				System.out.println(s1.substring(x,y)+" ");
				
			}
			System.out.println();
		}

	}

}
