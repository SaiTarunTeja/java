package Methods;

import java.util.Scanner;

public class PrimeRange_model2 {

	public static void main(String[] args) {

		Primee p = new Primee();
		p.prime1();

	}

}
class Primee
{
	int a,s,e,count,s2;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void prime1()
  {
		System.out.println("Enter Starting Number");
		
	    s=sc.nextInt();
	    
		System.out.println("Enter Ending Number");
		
		e=sc.nextInt();
	for(;s<=e;s++)
	{
		count=0;
		for(a=1;a<=s;a++)
		{
			if(s%a==0)
			{
				count++;
			}
		}
		int i=prime2();
		if(i!=0)
		System.out.println(i);
	}

  }
	public int prime2() {
		if(count==2)
		{
	        return s;
		}
		else {
			 return 0;
		}
	}
}