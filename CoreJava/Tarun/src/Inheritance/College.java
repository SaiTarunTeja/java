package Inheritance;
import java.util.*;
public class College {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Institution i=new Institution();
		System.out.println("What is your interest"+"\n"+"UG"+"\n"+"PG");
		String decision=sc.next();
		if(decision.equals("ug"))
		{
			System.out.println("What is your interest"+"\n"+"Degree"+"\n"+"B.Tech");
			String ugcourse=sc.next();
			if(ugcourse.equals("degree"))
			{
				i.Degree();
			}
			else
			{
				i.Btech();
			}
		}
		else
		{
			System.out.println("What is your interest"+"\n"+"MBA"+"\n"+"M.Tech");
			String ugcourse=sc.next();
			if(ugcourse.equals("MBA"))
			{
				i.MBA();
			}
			else
			{
				i.Mtech();
			}	
		}
		

	}

}
class Institution extends ug
{
	public Institution() {
		System.out.println("Welcome to our Institution");
	}
}
class ug extends pg
{
	public void Btech()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What Department Do you Want");
		System.out.println("EEE"+"\n"+"CSE"+"\n"+"IT"+"\n"+"ECE"+"\n"+"Mechanical"+"\n"+"Civil");
		String branch=sc.next();
		System.out.println("fee for "+branch+" is 35,000");
	}
	public void Degree()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What Department Do you Want in Bsc");
		System.out.println("MPC"+"\n"+"MPCS"+"\n"+"BZC"+"\n"+"MPG"+"\n"+"B.com"+"\n"+"BA");
		String branch=sc.next();
		System.out.println("fee for "+branch+" is 15,000");
	}
	
}
class pg
{
	public void MBA()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What Department Do you Want");
		System.out.println("Finance"+"\n"+"Marketing"+"\n"+"HRManagement"+"\n"+" Business Analytics");
		String branch=sc.next();
		System.out.println("fee for "+branch+" is 50,000");
	}
	public void Mtech()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What Department Do you Want");
		System.out.println("AI"+"\n"+"ML"+"\n"+"VLSI Design"+"\n"+"Fluid Mechanics");
		String branch=sc.next();
		System.out.println("fee for "+branch+" is 50,000");
	}
}