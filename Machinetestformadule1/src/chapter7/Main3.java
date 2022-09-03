package chapter7;
class Student implements Cloneable{
	String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Main3 {
public static void main(String[] args) throws CloneNotSupportedException {
	Student student = new Student("saudagar",1);
	Student student2 = (Student) student.clone();
	System.out.println(student);
	System.out.println(student2);
}
}
