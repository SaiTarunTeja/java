package SpringCore;

public class MethodInjection {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Tarun");
		customer.setMobile("1234");
		customer.setCity("Hyderabad");
		
		Orders orders = new Orders();
		orders.setCustomer(customer);
		
		System.out.println(orders.getCustomer().getName());
		System.out.println(orders.getCustomer().getMobile());
		System.out.println(orders.getCustomer().getCity());
		
		orders.setItemName("Sugar");
		orders.setPrice("60");
		System.out.println(orders.getItemName());
		System.out.println(orders.getPrice());
		System.out.println(orders.getCustomer());
		
//		orders.setCustomer(customer).getName();
	}
}
class Orders
{
	String itemName;
	String Price;
	Customer customer;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
class Customer
{
	String Name;
	String Mobile;
	String City;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
}