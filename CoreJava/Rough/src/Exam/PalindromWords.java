package Exam;

public class PalindromWords {

	public static void main(String[] args) {
		String s=new String("MOM AND DAD");
		String a[]=s.split(" ");
		int x,y;
//		for(String ZZ:a)
//		{
//			System.out.println(ZZ);
//		}
		for(x=0;x<a.length;x++)
		{
			String s1=new String("");
			for(y=a[x].length()-1;y>=0;y--)
			{
				s1=s1+a[x].charAt(y);
			}
			if(s1.equals(a[x]))
			{
				System.out.println(a[x]);
			}
		}

	}

}
