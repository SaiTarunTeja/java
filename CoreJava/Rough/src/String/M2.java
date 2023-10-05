package String;

public class M2 {

	public static void main(String[] args) {
		Xyz o=new Xyz(10);
		o.x();
		
	}

}

class Abc 
{
	int a,b;
	Abc(int a,int b)
	{
		this.a=a;this.b=b;
	}
	public  void a() {
		System.out.println("i am a hello");
	}
}
class Xyz extends Abc{
	int c;
	Xyz(int c)
	{
		super(1,2);
		this.c=c;
		System.out.println(a+" "+b);
	}
	public  void x() {
		super.a();
		System.out.println("i am x hello");
	}
}