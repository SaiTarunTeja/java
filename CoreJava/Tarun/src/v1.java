
public class v1 {

	public static void main(String[] args) {
		int n=1234,temp=n,a=0,b=0;
		for(;temp>0;temp/=10)
		{
			int r=temp%10;
			if(r>a)
			{
				a=r;
			}
		}
		System.out.println(a);
		temp=n;
		for(;temp>0;temp/=10)
		{
			int r=temp%10;
			if(b<a&&b>r)
			{
				b=r;
			}
		}
		System.out.println(b);

	}

}
