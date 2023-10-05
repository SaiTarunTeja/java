import java.util.*;
public class product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many products do you want to buy");
		int n=sc.nextInt();
		int a,b;
		 for(a=1;a<=n;a++)
		    {
		    shop sa = new shop();
		    System.out.println("Enter Product Name");
		    sc.nextLine();
		    sa.name = sc.nextLine(); 
		    System.out.println("Enter Product Quantity");
		    sa.quantity = sc.nextInt();
		    System.out.println("Enter Product price");
		    sa.price = sc.nextInt();
		    sa.total();
		    sa.discount1();
		    sa.bill();
		    sa.display();
		    }
	}

}
class shop
{
                String name;
                int quantity;
                int price;
                double total;
                double discount;
                double bill;
  
               public void total()
             {
                total=quantity*price;
               System.out.println(total);
   
             }
              public void discount1()
              {
              if(total>=2000)
               {
                 discount=(25/100.0)*total;
               }
              else if(total>=1500 && total<2000)
               {
                 discount=(20/100.0)*total;
               }
             else if(total>=1000  && total<1500)
               {
               discount=(15/100.0)*total;
               }
              else if(total>=500 && total<1000)
               {
                 discount=(10/100.0)*total;
               }
              else
               {
                 discount=(5/100.0)*total;
               }
           }
           public void bill()
              {
               bill = total-discount;
              }
            public void display()
              {
                  System.out.println(name +" "+ quantity +" "+ price);
                  System.out.println("Total= "+ total);
                  System.out.println("Discount= "+ discount);
                  System.out.println("Bill= "+ bill);
               }
  }
