package inheritance;

public class Product1 {

	public static void main(String[] args) {
		Book b=new Book("coding hub",12);
		b.calTotal();b.calDiscount();b.finaltotal();b.print();
		Software s= new Software();
		s.calTotal();s.calDiscount();s.finaltotal();s.print();

	}

}
class product
{
	String name;
	char code;
	int quantity;
	double price,total,discount;
	product()
	{
		name="Software";code='s';quantity=3;price=1200;
	}
	product(String name,char code,int quantity,double price)
	{
		this.name=name;this.code=code;this.quantity=quantity;this.price=price;
	}
	public void calTotal()
	{
		total=price*quantity;
	}
	public void finaltotal()
	{
		total=total-discount;
	}
	public void display()
	{
		System.out.println(name+" "+code+" "+quantity+" "+price);
	}
}
class Book extends product
{
	String author;
	int pages;
	Book(String author,int pages)
	{
		super("book",'B',5,470);
		this.author=author;
		this.pages=pages;
	}
	public void calDiscount()
	{
		if(total>=5000 && total<=10000)
			discount=1000;
		else
			discount=500;
	}
	public void print()
	{
		super.display();
		System.out.println(total+" "+discount+" "+author+" "+pages);
	}
}
class Software extends product
{
	String version;
	double edition;
	Software()
	{
		version="android choclet";
		edition=1.9;
	}
	public void calDiscount()
	{
		if(total>=5000 && total<=10000)
			discount=2000;
		else
			discount=300;
	}
	
	public void print()
	{
		super.display();
		System.out.println(total+" "+discount+" "+version+" "+edition);
	}
}