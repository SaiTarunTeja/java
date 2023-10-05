package Reiteration;
import java.util.*;
import java.io.*;
public class Greatest3Numbers 
{
/*	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) 
	{
		String[] name=new String[]{"veera","vamshi","Rakesh"};
	    
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
//	    for(int x=0;x<name.length;x++)
//	    System.out.println(name[x]);
		/*String[] num=new String[]{"10","21","01"};
	    Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}*/
	public static void main(String[] args) 
		{
	        int[] a = new int[]{10,120,90,40};
	        boolean flag = true;
	        for (int i = 1; i < a.length; i++) 
	        {
	        	if (a[i] < a[i - 1]) 
	            {
	        		flag=false;
	            }
	           else if(flag)
	        	System.out.println("Asc");
	        	break;
	        }
	        
	       // else
	        //	System.out.println("Not Asc");
	    }

	    public static boolean isAscendingArray(int[] array) 
	    {
	        for (int i = 1; i < array.length; i++) 
	        {
	            if (array[i] < array[i - 1]) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	
	

	/*public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName, LastName and Domain");
//		String fName = sc.next()///*"Jan"*/
//		String lName = sc.next()///*"Snow"*/;
//		String Domain = sc.next()///*"example.com"*/;
//		String password =fName.charAt(0)+lName+"@"+Domain;
//		System.out.println(password);
		
	
	/*{
		System.out.println("what You Want ==> Select Your Option");
		System.out.println("1.Greatest Of Three Numbers");
		System.out.println("2.Sum of Even digits & Product Of Odd Digits");
		System.out.println("3.Max Digit Of Given Number");
		String option = br.readLine();
			switch(option)
			{
				case "1" : ternary_Model1(); break;
				case "2" : System.out.println(evenSum_oddProduct()); break;
				case "3" : System.out.println(maxDigit()); break;
			}
		
		}
	  public static void ternary_Model1() 
	  {
		System.out.println("Enter a,b and c values");
		int a=0;
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int b=0;
		try {
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c=0;
		try {
			c = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Greatest of Given Numbers is "+ifelse_1(a,b,c));
		System.out.println("Greatest of Given Numbers is "+ternary1(a,b,c));
		System.out.println("Greatest of Given Numbers is "+ternary2(a,b,c));

		
	}
	public static int ifelse_1(int a, int b,int c)
	{
		
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	public static int ternary1(int a, int b,int c)
	{
		int d = (a>b)&&(a>c)?a:(b>c)&&(b>a)?b:c;
		System.out.println("Greatest of Given Numbers is "+d);///
 
		int result = a>b?(a>c?a:c):(b>c?b:c);
			return result;
	}
	public static int ternary2(int a, int b,int c)
	{
		int result = (a>b)?a:b;
		return result>c?result:c;
	}
	
	public static String evenSum_oddProduct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int temp=number,sum=0,product=1;
		while(temp>0)
		{
			int rem = temp%10;
			if(rem%2==0)
			{
				sum = sum+rem;
			}
			else
			{
				product = product*rem;
			}
			temp/=10;
		}
		return "sum= "+sum+" "+"product= "+product;
	}
	public static String maxDigit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int temp=number;
		int large=Integer.MIN_VALUE;
		System.out.println(large);
		int rem=0;
		while(temp>0)
		{
			rem=temp%10;
			if(rem>large)
				large=rem;
			temp/=10;
		}
		return "Max Digit "+number+" ==> "+ large;
		
	}*/

}
