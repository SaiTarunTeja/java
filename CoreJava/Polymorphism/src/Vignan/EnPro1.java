package Vignan;
import java.util.*;
public class EnPro1
{
		private static String product;
		private static char code;
		private static double price,quantity,total;
		static Scanner sc = new Scanner(System.in);
		public static void setpdetails()
		{
			System.out.println("Enter Product Name");
		    product=sc.nextLine();
			System.out.println("Enter Product Code");
			code=sc.next().charAt(0);
			System.out.println("Enter Product Price");
		    price=sc.nextDouble();
			System.out.println("Enter Product Quantity");
			quantity=sc.nextDouble();
		}
		public static double gettotal()
		{
			total=price*quantity;
			return total;
		}
		public void display()
		{
			System.out.println(product+" "+code+" "+price+" "+quantity);
		}
}
// class viraj
//{
//	public static void main(String args[])
//	{
//		EnPro1 e=new EnPro1();
////		e.setpdetails();
////		e.gettotal();
////		e.display();
//		e.toString();
//	}
//}
