package classmethodsandobjects;
import java.util.*;
public class circlerectangle 
{
	public static void main(String[] args) 
	{
		CR c = new CR();
		Scanner sc = new Scanner(System.in);
		System.out.println("What you want circle or rectangle");
		String a = sc.nextLine();
		if(a.equals("circle"))
		{
			System.out.println("Enter Radius value");
			int rad=sc.nextInt();
			c.r=rad;
			c.circle();
		}
		else
		{
			System.out.println("Enter Length");
			int len=sc.nextInt();
			c.l=len;
			System.out.println("Enter Breadth");
			int bre=sc.nextInt();
			c.b=bre;
			c.rectangle();
		}

	}

}
class CR
{
	int l,b,r;
	double area,circumference,perimeter;
	public void circle()
	{
		
		 area = (Math.PI)*Math.pow(r,2);
		 circumference = 2*(Math.PI)*r;
		 System.out.println("the area of circle "+area);
		 System.out.println("the cir of circle "+circumference);
	}
	public void rectangle()
	{

		int area =l*b;
		int perimeter=2*(l+b);
		System.out.println("the area of rectangle "+area);
		System.out.println("the Perimeter of rectangle "+perimeter);
	}
}
