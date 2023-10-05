package Advance;

public class Tp1 {

	public static void main(String[] args) 
	{
		Details d=new Details();
		d.D1("Sai", 1);
		d.D1("Pavan", 2);
		d.D1("Mahesh", 3);
		d.D1("Vamshi", 4);

	}

}
class Details
{
	String Name;
	int id;
	public void D1(String Name,int id)
	{
		this.Name=Name;
		this.id=id;
		
		out o1=new out();
		o1.op(Name, id);
	}
}
class out
{
	public void op(String Name,int id)
	{
		System.out.println(Name+" "+id);
	}
}