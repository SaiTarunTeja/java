package Advance;

public class p4 {

	public static void main(String[] args) {
		EmpService e=new EmpService();
		Emp emp=new Emp(1,"vikram");
		e.save(emp);
		emp=e.getEmp();
		System.out.println(emp.getEmpId()+""+emp.getName());
	}

}
class Emp
{
	int empId;
	String name;
	
	public Emp(int i,String n)
	{
		empId=i;
		name=n;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getName()
	{
		return name;
	}
}
class EmpService
{
	public void save(Emp e)
	{
		System.out.println("-----save------"+e.getName()+" "+e.getEmpId());
	}
	public Emp getEmp()
	{
		Emp e=new Emp(1,"Vikram");
		return e;
	}
}