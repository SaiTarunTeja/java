
public class B2 {

	public static void main(String[] args) {
		// Second largest element without using sorting
		int a[] = {2,5,6,74,9};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			secondlargest=largest;
			largest = a[i];
		}
		else if(a[i]>secondlargest) {
			if(a[i]!=largest) {
				secondlargest=a[i];
			}
		}
		}
		System.out.println(secondlargest);

	}

}
