package BO1_Strings;

public class StoI {

	public static void main(String[] args) 
	{
		String s=new String("a1b2c10");
		int x,z=0;
	
			for(int y=0;y<s.length()-1;y++)
			{
				if((s.charAt(y)>='0' && s.charAt(y)<='9')&&(s.charAt(y+1)>='0' && s.charAt(y)<='9'))
				{
					z=z*10+Character.getNumericValue(s.charAt(y));
				}
				else
				{
					z=z+Character.getNumericValue(s.charAt(y));
				}
			}
			System.out.println(z);
	}

}