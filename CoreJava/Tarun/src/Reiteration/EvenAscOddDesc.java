package Reiteration;
import java.util.*;
public class EvenAscOddDesc {

	public static void main(String[] args) {
		int[] a = new int[] {1,5,2,7,3,9};
		int search = 99;
		int result = Arrays.binarySearch(a, search);
		System.out.println(result);
	}
	
}
