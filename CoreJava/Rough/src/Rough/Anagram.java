package Rough;

public class Anagram {

	public static void main(String[] args) {
		String s1="tea";
		String s2="eat";
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		int x,y;
		if(a1.length==a2.length)
		{
			for(x=1;x<a1.length;x++)
			{
				for(y=0;y<a1.length;y++)
				{
					if(a1[y]>a1[y+1])
					{
						char temp=a1[y];
						a1[y]=a1[y+1];
						a1[y+1]=temp;
					}
				}
			}
			for(x=0;x<a2.length;x++)
			{
				for(y=0;y<a2.length-x;y++)
				{
					if(a2[y]>a2[y+1])
					{
						char temp=a2[y];
						a2[y]=a2[y+1];
						a2[y+1]=temp;
					}
				}
			}
			if(a1==a2)
			{
				System.out.println("It is anagram");
			}
			else
			{
				System.out.println("it is not an anagram");
			}
		}
		else
		{
			System.out.println("it is not an anagram");
		}

	}

}
