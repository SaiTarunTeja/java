package Collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		collectionDemo();

	}
	public static void collectionDemo()
	{
		Collection <String> fruitCollection = new ArrayList<>();
		fruitCollection.add("Banana");
		fruitCollection.add("Apple");
		fruitCollection.add("Mango");
		fruitCollection.add("Goa");

		System.out.println(fruitCollection);
		
//		fruitCollection.parallelStream().forEach(System.out::println);
		fruitCollection.remove("Banana");
		System.out.println(fruitCollection);
		
		fruitCollection.contains("Apple");
		
		fruitCollection.forEach((element)->{
			System.out.println(element);
		});
		
		fruitCollection.clear();
		System.out.println(fruitCollection);
	}
	public static void listDemo()
	{
//		List<String> list = 
	}
}
