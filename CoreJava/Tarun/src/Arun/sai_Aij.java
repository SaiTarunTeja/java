package Arun;

public class sai_Aij {

	public static void main(String[] args) {
		String name="sai";
		System.out.println(modifirdName(name));
	}
	public static String modifirdName(String name)
	{
		return name.substring(1,2).toUpperCase()+name.substring(2,name.length())+(char)(name.charAt(name.length()-1)+1);
	}
}
