package inheritance;

public class CP1 {

	public static void main(String[] args) {
		child ch=new child();
		ch.add();

	}

}
class child extends parent
{
	int a=1,b=2;
	public void sub()
	{
		System.out.println(d);
		System.out.println(a+b);
	}
}
class parent
{
	int c=4,d=2;
	public void add()
	{
		System.out.println(c+d);
	}
}