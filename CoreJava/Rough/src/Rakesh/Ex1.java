package Rakesh;

public class Ex1 {

	public static void main(String[] args) {
		String s1 = "Rakesh veera vamshi Shiva";
		String[] s2 = s1.split(" ");
		String s3;
		for(int x=0;x<s2.length;x++)
		{
		    s3=s2[x];
		    System.out.print(s3.substring(s3.length()-3));
		    System.out.print(s3.substring(0,s3.length()-3)+" ");
		}

	}

}
