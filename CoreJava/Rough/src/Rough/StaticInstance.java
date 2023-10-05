package Rough;

public class StaticInstance {
        
        int b=0;
       
        void m1()
        {
        	b++;
        	System.out.println(b);
        }
        
	public static void main(String[] args) {
		StaticInstance s=new StaticInstance();
		s.m1();
		s.m1();
		Hello1.m2();
		Hello1.m2();

	}

}
class Hello1
{
	static int a=0;
	static void m2()
	{
		a++;
		System.out.println(a);
	}
}