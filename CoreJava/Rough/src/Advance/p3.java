package Advance;

public class p3 {

	public static void main(String[] args) {
		demo1 d=new demo1();
		prathap x=d.m1();
		System.out.println(x.a +" "+x.b);

	}

}
class prathap
{
	int a,b;
	prathap(int a,int b)
	{
	   this.a=a;
	   this.b=b;
	}
}
class demo1 
{
	public prathap m1()
	{
		prathap p=new prathap(90,90);
		int x=p.a+p.b;
		return p;
	}
	
	
}