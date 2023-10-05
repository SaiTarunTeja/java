package CRough;
import java.util.*;
public class UserArrayList {

	public static void main(String[] args) {
		AddingData data = new AddingData(); 

		   ArrayList<Student> listst = data.studentData(); 

		   for(Student st:listst)
		   { 
		     System.out.println("Student's name: " +st.name); 
		     System.out.println("Student ID " +st.id); 
		     System.out.println("Roll number: " +st.rollNo); 
		   } 
		   LinkedList l1=new LinkedList();
		   List l=Collections.synchronizedList(l1);
	}

}
class Student 
{  
   String name; 
   int id; 
   int rollNo; 
   Student(String name, int id, int rollNo)
   { 
     this.name = name; 
     this.rollNo = rollNo; 
     this.id = id; 
   } 
}
class AddingData 
{ 
   ArrayList<Student> studentData()
   { 
    Student s1 = new Student("Deep", 1234, 04); 
    Student s2 = new Student("Shubh", 4321, 20 ); 
    Student s3 = new Student("Riddhi", 1212, 02); 
 
    ArrayList<Student> studentlist = new ArrayList<Student>(); 

     studentlist.add(s1); 
     studentlist.add(s2); 
     studentlist.add(s3); 
 
     return studentlist; 
   } 
}