package Methods;

import java.util.Scanner;


public class PalinRangeModel13 {

	public static void main(String[] args) {
		pali p=new pali();
	    Scanner sc = new Scanner(System.in);
	  	  System.out.println("Enter Starting And Ending Number");
	  	  int start=sc.nextInt();	 
	  	  int end=sc.nextInt();
	    	for(;start<=end;start++)
	    	{
	    		
	             p.palin1(start);
	    	}
	}

}
class pali
{
    int start,end;
    public void palin1(int start)
    {
    	
        int a =0;
        int temp=start;
        for(;temp>0;temp/=10)
        {
            int r=temp%10;
            a=a*10+r;
        }
        if(a==start)
        {
            System.out.println(a);
        }
    	
    }
}
