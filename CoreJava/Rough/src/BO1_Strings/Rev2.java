package BO1_Strings;

public class Rev2 {

	public static void main(String[] args) {
		String s1=new String("Hello all Good Morning");
		//0iieH all Good gninroM
		String[] a=s1.split(" ");
//		String s2=new String("");
		int x,y;
		for(x=0;x<a.length;x++)
		{
			String s2=new String("");
			String rev="";
			if(a[x].equals(a[0]) || a[x].equals(a[a.length-1]))
			{
				//a[x]="olleH";
				 s2=new String(a[x]);
				 for(y=s2.length()-1;y>=0;y--)
				 {
					 rev=rev+s2.charAt(y);
				 }
				 a[x]=rev;
			}
			System.out.println(a[x]);
//			if(x==0 && x==a.length-1)
//			{
//				System.out.print(rev);
//			}
//			else
//			{
//				System.out.println(a[x]);
//			}
		}

	}

}
