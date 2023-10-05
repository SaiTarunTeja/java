package Rough;

public class StaticKeyword {
	static int b=0;
	int a=0;
	StaticKeyword()
	{
		a++;
		b++;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		StaticKeyword s=new StaticKeyword();
		StaticKeyword s1=new StaticKeyword();
		StaticKeyword s2=new StaticKeyword();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		



	}

}
