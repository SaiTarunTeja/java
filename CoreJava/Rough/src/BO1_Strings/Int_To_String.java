package BO1_Strings;

public class Int_To_String {

	public static void main(String[] args) {
		S_I.Int_To_Str();
		S_I.Str_To_Int();
		S_I.Str_To_Double();
	}
}
class S_I
{
	public static void Str_To_Int()
	{
		String s=new String("1");
		int a=Integer.valueOf(s);
		System.out.println(a+1);
	}
	public static void Int_To_Str()
	{
		int i=1;
		String s=String.valueOf(i);
		System.out.println(s+1);
	}
	public static void Str_To_Double()
	{
		String s=new String("1.3");
		double a=Double.valueOf(s);
		System.out.println(a+1);
	}
}