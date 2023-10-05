package BO1_Strings;

public class Rev1 {

	public static void main(String[] args) {
		String s1=new String("Hello All Good Morning");
		String[]a=s1.split(" ");
		String rev1=new String("");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			String s2=a[x];
			String rev2=new String("");
			for(y=s2.length()-1;y>=0;y--)
			{
				rev2=rev2+s2.charAt(y);
			}
			rev1=rev1+rev2+" ";
		}
        System.out.println(rev1);
	}

}
