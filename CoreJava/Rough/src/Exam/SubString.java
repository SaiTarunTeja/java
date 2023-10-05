package Exam;

public class SubString {

	public static void main(String[] args) {
		int x,y;
		String s=new String("abc");
		for(x=0;x<s.length();x++)
		{
			for(y=x+1;y<=s.length();y++)
			{
				System.out.println(s.substring(x,y));
			}
		}

	}

}
