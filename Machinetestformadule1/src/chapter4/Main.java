package chapter4;
class Teacher{
	String name= "sir";//compostion
	int salary = 50000;//compostion
	String hobbies = "play game";//aggregration
	void showInfo() {//compostion
		System.out.println("name is "+ name);
		System.out.println("salary is "+salary);
	}
	void hobbiesInfo() {//aggregration
		System.out.println("hobbies is "+hobbies);
	}
	
}
class Faculty{
	Teacher teacher = new Teacher();
	
}
public class Main {
public static void main(String[] args) {
	Faculty faculty = new Faculty();
	faculty.teacher.showInfo();//compostion
	faculty.teacher.hobbiesInfo();//aggregration
	
}
}
