package Constructor;

public class Introduction {

	public static void main(String[] args) {
		Aim a1=new Aim();
		
		String a = new String("sai");
		String x= new String(a);
		System.out.println(x);
		
		char c[]=new char[] {'A','r','u','n'};
		String y=new String(c);
		System.out.println(y);
		
		byte b[]=new byte [] {'a','1'};
		String z=new String(b);
		System.out.println(z);
		

	}

}
class Aim
{
	Aim()
	{
	  System.out.println("Iam Constructor Aim");	
	}
}