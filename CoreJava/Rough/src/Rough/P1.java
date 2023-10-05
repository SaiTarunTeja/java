package Rough;

public class P1 {

	public static void main(String[] args) {
		String s="programe";
		int x,y;
		
		for(x=0;x<s.length();x++)
		{
			for(y=0;y<=x;y++)
			{
				System.out.print(s.charAt(y));
			}
			System.out.println();
			
		}
		for(x=s.length()-2;x>=0;x--)
		{
			for(y=0;y<=x;y++)
			{
				System.out.print(s.charAt(y));
			}
			System.out.println();
		}

	}

}
