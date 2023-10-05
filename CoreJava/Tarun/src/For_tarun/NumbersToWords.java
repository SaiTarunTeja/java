package For_tarun;

public class NumbersToWords {

	public static void main(String[] args) {
		// Given Input Number Comes in Words AS Output
		int num=26040,rem=0,rev=0,x=0,count=0; 
		for(;num>0;num=num/10)
		{
		    rem=num%10;
		    rev=rev*10+rem;
		    if(rev==0)
		    {
		       count++;
		    }
		}
	        for(;rev>0;rev=rev/10)
	        {
		           x=rev%10;
		           if(x==1)
		           System.out.print("One ");
		           else if(x==2)
		           System.out.print("Two ");
		           else if(x==3)
			       System.out.print("Three ");
		           else if(x==4)
		           System.out.print("Four ");
		           else if(x==5)
			       System.out.print("Five ");
		           else if(x==6)
		           System.out.print("Six ");
		           else if(x==7)
			       System.out.print("Seven ");
		           else if(x==8)
			       System.out.print("Eight ");
		           else if(x==9)
			       System.out.print("Nine ");
		           else
		           System.out.print("zero ");
		     }
		     for(x=0;x<count;x++)
		     {
		       System.out.print("zero ");
		     }

	}

}
