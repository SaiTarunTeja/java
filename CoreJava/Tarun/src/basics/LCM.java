package basics;

public class LCM {

	public static void main(String[] args) {
		 int x=60,y=12,z,big,HCF=0,LCM;
		    if(x>y)
		    {
		        big=x;
		    }
		    else
		    {
		       big=y; 
		    }
		    for(z=1;z<=big;z++)
		    {
		        if(x%z==0 && y%z==0)
		        {
		            HCF=z;
		        }
		    }
		    LCM=(x*y)/HCF;
		    System.out.println(LCM);

	}

}
