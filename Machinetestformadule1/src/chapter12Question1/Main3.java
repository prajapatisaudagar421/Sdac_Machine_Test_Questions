package chapter12Question1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Student1{
	String name;
	int id;
	String add;
	public Student1(String name, int id, String add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
	
}
public class Main3 {
public static void main(String[] args) {
	Vector<Student1> vector = new Vector<Student1>();
	Student1 student1 = new Student1("tom",1,"vasai");
	Student1 student2 = new Student1("jerry",2,"borivali");
	Student1 student3 = new Student1("motu",3,"mumbai");
	Student1 student4 = new Student1("patlu",4,"thane");
	Student1 student5 = new Student1("ram",5,"vasai");
	vector.add(student1);
	vector.add(student2);
	vector.add(student3);
	vector.add(student4);
	vector.add(student5);
	System.out.println(vector);
	//update
	Student1 student6 = new Student1("abc",6,"japan");
	vector.set(2, student6);
	System.out.println(vector);
	//delete
	System.out.println(vector.remove(student6));
	System.out.println(vector.remove(2));
	System.out.println(vector);
	//seach
	System.out.println(vector.get(2));
	System.out.println(vector.indexOf(student5));
	System.out.println("foreach");
	for (Student1 student12 : vector) {
		System.out.println(student12);
	}
	System.out.println("itrator");
	Iterator<Student1> iterator = vector.iterator();
	while (iterator.hasNext()) {
		Student1 student12 = (Student1) iterator.next();
		System.out.println(student12);
	}
	System.out.println("listitrator");
	ListIterator<Student1> listIterator = vector.listIterator();
	while (listIterator.hasNext()) {
		Student1 student12 = (Student1) listIterator.next();
		System.out.println(student12);
	}
	System.out.println("emumration");
	Enumeration<Student1> enumeration = vector.elements();
	while (enumeration.hasMoreElements()) {
		Student1 student12 = (Student1) enumeration.nextElement();
		System.out.println(student12);
	}
	
	
}
}
