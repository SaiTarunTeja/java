package Advance;

public class d2p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Myservice
{
	public void add();
}
class MyserviceImpl implements Myservice
{

	@Override
	public void add() 
	{
		Myservice mydao=MyserviceFactory.getData();		
	}
}
class MyserviceFactory
{
	static Myservice myservice=new MyserviceImpl();
	public static Myservice getServiceData()
	{
		return myservice;
	}
	public static Myservice getData() {
		// TODO Auto-generated method stub
		return null;
	}
}