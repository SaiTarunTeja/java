package Rough;

import String.M1;

public class StaticBro {
     static int a=10;
     static int b=22;
    static void change()
     {
    	  a=20;
     }
    StaticBro()
    {
    	b=12;
    }
    void M1()
    {
    	a=999;
    }
	public static void main(String[] args) {
//		StaticBro.change();
		StaticBro sb=new StaticBro();
//		a=555;
		M1 m=new M1();
		System.out.println(a+" "+b);

	}

}
