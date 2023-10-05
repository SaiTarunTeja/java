package whileloop;
import java.util.*;
public class PalindromeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter Ending Number");
        int e = sc.nextInt();
        while(s<=e)
        {
        	int a=0,temp=s;
        	while(temp>0)
        	{
        		int r=temp%10;
        		a=a*10+r;
        		temp/=10;
        	}
        	if(a==s)
        System.out.println(a);
        	s++;
        }
	}

}
