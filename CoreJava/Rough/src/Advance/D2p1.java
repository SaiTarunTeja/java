package Advance;

public class D2p1 {

	public static void main(String[] args) {
		Dto d=new Dto();
		d.setA(100);
		sk a=new sk();
		String result=a.display(d);
        System.out.println(result);
	}

}
class sk
{
	int a;
	public String display(Dto d)
	{
		a=d.getA();
		return a+" ";
	}
}
class Dto
{
	private int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}