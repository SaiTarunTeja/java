package SpringCore;

public class ConstructorInjection {

	public static void main(String[] args) {
		Parent parent = new Parent("Sai","Hyd");
		Student student = new Student("Tarun","1",parent);
		System.out.println(student);
	}
}
class Student
{
	private String sName;
	private String id;
	private Parent parent;
	public Student(String sName, String id, Parent parent) {
		super();
		this.sName = sName;
		this.id = id;
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", id=" + id + ", parent=" + parent + "]";
	}
}
class Parent
{
	private String PName;
	private String Paddress;
	public Parent(String pName, String paddress) {
		super();
		PName = pName;
		Paddress = paddress;
	}
}