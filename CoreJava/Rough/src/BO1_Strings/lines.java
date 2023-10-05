package BO1_Strings;

public class lines {

	public static void main(String[] args) {
		String s1=new String("line1\nline2\nline3\nline4");
		int x,count=1;
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)=='\n')
			{
				count++;
			}
		}
		System.out.println("number of lines"+count);
	}

}
