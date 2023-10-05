package Reiteration;

public class ArrayObject {

	public static void main(String[] args) {
//		demo d = new demo();
//		demo[] d1 = new demo[10];
////		d1[0]="qw";
//		
//		System.out.println(d1[0]);
		int y1 = 199325112;
		String s = String.valueOf("199325112");
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[ch.length];
		
		for(int x=0;x<ch.length;x++)
		{
//			System.out.println(ch[x]);
//			int index=0;
//			int[] repeat ;
			int count = 1;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<ch.length;y++)
			{
				if(ch[x]==ch[y] )
				{
					count++;
					b[y]=true;
					
				}
			}
//			System.out.println(ch[x]);
			if(count>=1)
			{
				element(ch[x]);
				elementCount(count);
				System.out.println();
			}
			
		}
	}
	public static void element(char ch)
	{
		switch (ch)
		{
			case '1' : System.out.print("1 repeates==> "); break;
			case '2' : System.out.print("2 repeates==> "); break;
			case '3' : System.out.print("3 repeates==> "); break;
			case '4' : System.out.print("4 repeates==> "); break;
			case '5' : System.out.print("5 repeates==> "); break;
			case '6' : System.out.print("6 repeates==> "); break;
			case '7' : System.out.print("7 repeates==> "); break;
			case '8' : System.out.print("8 repeates==> "); break;
			case '9' : System.out.print("9 repeates==> "); break;
			
		}
	}
	public static void elementCount(int count)
	{
		switch (count)
		{
			case 1 : System.out.print(1 +" time"); break;
			case 2 : System.out.print(2 +" times"); break;
			case 3 : System.out.print(3 +" times"); break;
			case 4 : System.out.print(4 +" times"); break;
			case 5 : System.out.print(5 +" times"); break;
			case 6 : System.out.print(6 +" times"); break;
			case 7 : System.out.print(7 +" times"); break;
			case 8 : System.out.print(8 +" times"); break;
			case 9 : System.out.print(9 +" times"); break;
			
		}
	}
	
}
abstract class demo
{
	public int number(int a)
	{
		return a;
	}
	
}//*/