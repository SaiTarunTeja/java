package ArrayBasics;
import java.util.*;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array length");
		int length =sc.nextInt();
		int a[]=new int[length];
		System.out.println("Enter Array Elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Armstrong numbers in this array is");
		for(x=0;x<a.length;x++)
		{
			int temp=a[x],count=0;
			 for(;temp>0;temp/=10)
			 {
				 count++;
			 }
			 temp=a[x];
			 int rem=0;
			 double sum=0;
			 for(;temp>0;temp/=10)
			 {
				rem=temp%10;
				sum=sum+(Math.pow(rem,count));
			 }
			 if(sum==a[x])
			 {
				 System.out.println(a[x]);
			 }
		}

	}

}
