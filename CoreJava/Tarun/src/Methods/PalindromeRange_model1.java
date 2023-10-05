package Methods;
import java.util.*;
import java.util.Scanner;

public class PalindromeRange_model1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		palin p = new palin();
		System.out.println("Enter Starting Number");
        int s = sc.nextInt();
        System.out.println("Enter ending Number");
        int e = sc.nextInt();
        for(;s<=e;s++)
        {
            System.out.println(p.palin1(s));
        }
		

	}

}
class palin
{
	int r,a,temp,flag;
    public int palin1(int temp)
    {
       int x=temp;//
       a=0;
        for(;temp>0;temp/=10)
        	{
        		r=temp%10;
        		a=a*10+r;
        	}
        	if(a==x)
        	{
        		flag=a;
        	}
        	return flag;
    }
}