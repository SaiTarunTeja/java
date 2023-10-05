package BO1_Strings;

public class _122233334 {

	public static void main(String[] args) {
		String s1=new String("122233334");
		char[] a=s1.toCharArray();
		boolean[] b=new boolean[a.length];
		int x,y,count;
		for(x=0;x<a.length;x++)
		{
			count=1;
			if(b[x]==true)
			continue;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y] && x!=y)
				{
					count++;
					b[y]=true;
				}
			}
			if(count>=1)
			{
				Array.element(a[x]);
				Array.count(count);
			}
		}

	}

}
class Array
{
	public static void element(char a)
	{
		switch(a)
		{
		  case '1': System.out.print("one"); break;
		  case '2': System.out.print("Two"); break;
		  case '3': System.out.print("three"); break;
		  case '4': System.out.print("Four"); break;
		  case '5': System.out.print("Five"); break;
		  case '6': System.out.print("Six"); break;
		  case '7': System.out.print("Seven"); break;
		  case '8': System.out.print("Eight"); break;
		  case '9': System.out.print("Nine"); break;
		}
	}
	public static void count(int a)
	{
		switch (a)
		{
		  case 1: System.out.print("one "); break;
		  case 2: System.out.print("Two "); break;
		  case 3: System.out.print("three "); break;
		  case 4: System.out.print("Four "); break;
		  case 5: System.out.print("Five "); break;
		  case 6: System.out.print("Six "); break;
		  case 7: System.out.print("Seven "); break;
		  case 8: System.out.print("Eight "); break;
		  case 9: System.out.print("Nine "); break;
		}
	}
}