package arraysProduct;
import java.util.*;
public class ProductApp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("how many items you want to buy");
		int total_items=sc.nextInt();
		String[] Name = new String[total_items];
		double[] Quantity = new double[total_items];
		double[] price = new double[total_items];
		double[] total = new double[total_items];
		double bill=0;
		for(int x=0;x<total_items;x++)
		{
			System.out.println("Enter Product Name");
			Name[x]=sc.next();
			System.out.println("Enter Quantity");
			Quantity[x]=sc.nextDouble();
			System.out.println("Enter Price");
			price[x]=sc.nextDouble();
		}
		for(int x=0;x<total_items;x++)
		{
			total[x]=Quantity[x]*price[x];
		}
		for(int x=0;x<total_items;x++)
		{
			System.out.println(Name[x]+" "+Quantity[x]+" "+price[x]+" "+total[x]);
		}
		for(int x=0;x<total_items;x++)
		{
			bill=bill+total[x];
		}
		System.out.println("Your Bill = "+ bill);
		
	}

}
