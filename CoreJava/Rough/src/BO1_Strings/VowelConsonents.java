package BO1_Strings;

public class VowelConsonents {

	public static void main(String[] args) {
		String s1=new String("A quick brown fox jumps over the lazy dog");
		int x=0,vowel=0,consonents=0,y=0,z=0;
		/*char[] a=new char[11];
		int[] c=new int[11];
		char[] b=new char[22];
		int[] d=new int[22];*/
		for(x=0;x<s1.length();x++)
		{
			if(s1.charAt(x)=='A'||s1.charAt(x)=='a'||s1.charAt(x)=='e'||s1.charAt(x)=='i'||s1.charAt(x)=='o'||s1.charAt(x)=='u')
			{
				vowel++;
				/*a[y]=s1.charAt(x);
				c[y]=x;
				y++;*/
			}
			else if(s1.charAt(x)!=' ')
			{
				consonents++;
				/*b[z]=s1.charAt(x);
				d[z]=x;
				z++;*/
			}
		}
		System.out.println("number of vowels= "+vowel);
		System.out.println("number of consonents= "+consonents);
		/*System.out.println("vowels and index in given String is ");
		for(char ZZ:a)
		{
			System.out.print(ZZ+"  ");
		}
		System.out.println();
		for(int ZZ:c)
		{
			System.out.print(ZZ+" ");
		}
		System.out.println();
		System.out.println("consonents in given String is ");
		for(char ZZ:b)
		{
			System.out.print(ZZ+"  ");
		}
		System.out.println();
		for(int ZZ:d)
		{
			System.out.print(ZZ+" ");
		}*/

	}

}
