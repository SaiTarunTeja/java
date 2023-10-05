package Rough;

public class Student1 
{
    int x;
    Student1(int x)
    {
    	this.x=x;
    }
    void display()
    {
    	System.out.println(x);
    }
	public static void main(String[] args) 
	{
		Student1 s=new Student1(5);
		s.display();

	}

}
