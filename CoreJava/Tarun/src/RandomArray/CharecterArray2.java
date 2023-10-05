package RandomArray;
import java.util.*;
public class CharecterArray2 {

	public static void main(String[] args) {
		String chars = "abcdABQERS#&){@$%";
		Random r = new Random();
		char c = chars.charAt(r.nextInt(chars.length()));
		System.out.print(c);

	}

}
