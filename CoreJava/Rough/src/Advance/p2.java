package Advance;

public class p2 {

	public static void main(String[] args) {
		A a=new A();
		

	}

}
class A
{
	Dao d=new Dao();
	public Dao getconnect()
	{
		return d;
	}
}
class Dao//DATA ACCESS OBJECT
{
	private int c,d;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	
}