package String;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello all goodmorning";
		String s2[]=s1.split(" ");
//		String a[]=s1.split(" ");
		String high=s2[0];
		int x;
		for(x=0;x<s2.length;x++)
		{
			if(s2[x].length()>high.length())
			{
				high=s2[x];
			}
		}
		System.out.println(high);

	}

}
