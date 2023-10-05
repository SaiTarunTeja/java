package BO1_Strings;

public class s1 {

	public static void main(String[] args) {
		String s1=new String("Hello this is codinghub user");
		//user codinghub is siht hello
		int x,y;
		String[] s2=s1.split(" ");
		String s3=new String("this");
		for(x=s2.length-1;x>=0;x--)
		{
			if(s2[x].equals(s3))
			{
			  	s2[x]="siht";
			}
			System.out.println(s2[x]);
			
		}

	}

}
