package For_tarun;
import java.util.*;
public class roman_num {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
    int num=sc.nextInt();
    int rem,rev=0,count=0;
    for(; num>0;num/=10)
    {
    	rem=num%10;
    	rev=rev*10+rem; 
    	if(rev==0)
    	{
    		count++;
    	}
    }
    for(;rev>0;rev/=10)
    {
    	rem=rev%10;
    	switch(rem) 
    	{
    	case 0:System.out.print(" 0 ");
    	break;
    	case 1:System.out.print(" I ");
    	break;
    	case 2:System.out.print(" II ");
    	break;
    	case 3:System.out.print(" III ");
    	break;
    	case 4:System.out.print(" IV ");
    	break;
    	case 5:System.out.print(" V ");
    	break;
    	case 6:System.out.print(" vI ");
    	break;
    	case 7:System.out.print(" vII ");
    	break;
    	case 8:System.out.print(" vIII ");
    	break;
    	case 9:System.out.print(" IX ");
    	break;
    	
    	}
    }
    for(;count>0;count--)
    {
    	System.out.print("0 ");
    }
    
	}

}
