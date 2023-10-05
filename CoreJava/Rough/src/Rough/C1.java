package Rough;
import java.util.*;
public class C1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Employee a1[]=new Employee[5];
		for(int x=0;x<5;x++)
		{
			System.out.println("Enter id ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name ");
			String name=sc.next();
			
			a1[x]=new Employee(id,name);
		}
		System.out.println("\n The Employee data is ");
		for(int i=0;i<a1.length;i++)
		{
//			a1[i].displayData();
			System.out.println(a1[i]+" ");
		}
	}

}
class Employee
{
	int id;
	String name;
	Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayData()
	{
		System.out.println(id+"\t"+name);
	}
}