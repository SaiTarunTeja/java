package Rough;

public class Honda extends Bike
{
	int speedlimit=150;
	public static void main(String[] args) {
//		Honda obj=new Honda();  //child class object
//        System.out.println(obj.speedlimit);//150
//        Bike obj1=new Bike();   //parent class object
//        System.out.println(obj1.speedlimit);//90
      Bike obj3=new Honda();  //child class object in parent class reference
        System.out.println(obj3.speedlimit);
          
	}
	}
class Bike 
{  
 int speedlimit=90;
 
}  
 