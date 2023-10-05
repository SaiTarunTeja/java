
public class max {

	public static void main(String[] args) {
		int a=15,b=25,c=10;
		if(a<b)
		{
			System.out.println("heeello");
			a=a+b;//a=15+25=40
			b=a-b;//b=40-25=15
			a=a-b;//a=40-15=25
		}
		if(a<c)
		{
			System.out.println(" it is");
			a=a+c;			
			c=a-c;
			a=a-c;
		}
		if(b<c)
		{			
			System.out.println("hrrrrr yyy");
			b=b+c;
			c=b-c;
			b=b-c;			
		}
		System.out.println(a+" "+b+" "+c);
		

	}

}
