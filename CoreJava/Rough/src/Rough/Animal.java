package Rough;

class BabyDog1 extends Dog
{  
     
}  
class Dog extends Animal
{  
   void eat()
   {
	   System.out.println("dog is eating...");
   }  
}  
class Animal
 {  
   public static void main(String args[])
   {  
      Animal a=new BabyDog1();  
      a.eat(); 
     
   }

     void eat() 
    {
	  System.out.println("Animal is Eating");
	
    }
 }  