package Strings;

public class ImmutableClass {

	private int i;
	ImmutableClass(int i)
	{
		this.i=i;
	}
	public ImmutableClass modify(int i)
	{
		if(this.i==i)
			return this;
		else
			return new ImmutableClass(i);
	}
	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(10);
		ImmutableClass ic1 = ic.modify(100);
		ImmutableClass ic2 = ic.modify(10);
		
		System.out.println(ic.hashCode()+" "+ic1.hashCode()+" "+ic2.hashCode());
		System.out.println(ic+"\n"+ic1+"\n"+ic2);
		System.out.println(ic==ic1);
		System.out.println(ic==ic2);
		
		final Integer a = 10;
//		a=a+10;
		final StringBuffer sb = new StringBuffer("Sai");
		sb.append("Tarun");//here we modifying content but not reassigning 
	}
	
}
