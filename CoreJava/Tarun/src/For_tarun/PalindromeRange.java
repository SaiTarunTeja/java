package For_tarun;
import java.util.*;
public class PalindromeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter ending Number");
        int e = sc.nextInt();
        int r,a;
        for(;s<=e;s++)
        {
        	int temp=s;
        	a=0;
        	for(;temp>0;temp/=10)
        	{
        		r=temp%10;
        		a=a*10+r;
        	}
        	if(a==s)
        	{
        		System.out.println(a);
        	}
        }
	}

}
