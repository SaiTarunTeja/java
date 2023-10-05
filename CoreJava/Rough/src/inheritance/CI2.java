package inheritance;

public class CI2 {

	public static void main(String[] args) {
		BB b=new BB();
		b.B1();

	}

}
class AA
{
	public void A1()
	{
		System.out.println("i am in A");
	}
}
class BB extends AA
{
	public /*static*/ void B1()
	{
		super.A1();
		System.out.println("i am in B");
	}
}