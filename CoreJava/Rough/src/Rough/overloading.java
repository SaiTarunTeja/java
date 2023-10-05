package Rough;

public class overloading {

	public static void main(String[] args) {
		overloading o=new overloading();
		o.add(1, 2);
		o.add(10, 20, 30);

	}
    static void add()
    {
    	System.out.println(23+2);
    }
    private void add(int a,int b)
    {
    	System.out.println(a+b);
    }
    final void add(int a,int b,int c)
    {
    	System.out.println(a+b+c);
    }
}
