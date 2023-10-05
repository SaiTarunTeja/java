package CRough;

public class userdefinedArray {

	public static void main(String[] args) {
				Groceries[] arr;

				
				arr = new Groceries[2];

				
				arr[0] = new Groceries("Milk", 20);

				arr[1] = new Groceries("Eggs", 60);

				
				System.out.println("Groceries data in grocery arr 0: ");
				arr[0].display();

				System.out.println("Groceries data in grocery arr 1: ");
				arr[1].display();
				for(Object temp:arr)
					System.out.println(temp);

	}

}
class Groceries {

	public String product;
    public int price;


	Groceries(String product, int price)
	{
		this.product = product;
		this.price = price;
	}

	public void display()
	{
		System.out.println("Product is: " + product + " "
						+ "and it's price is: "
						+ price);
		System.out.println();
	}
}

