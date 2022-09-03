package chapter12Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
	String name;
	int id;
	String add;
	public Student(String name, int id, String add) {
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
public class Main1 {
public static void main(String[] args) {
	ArrayList<Student> list = new ArrayList<Student>();
	Student student5 = new Student("saudagar",01,"vasai");
	Student student1 = new Student("tom",02,"japan");
	Student student2 = new Student("jerry",03,"japan");
	Student student3 = new Student("mr perfect",04,"universe");
	Student student4 = new Student("superman",05,"america");
	list.add(student1);
	list.add(student2);
	list.add(student3);
	list.add(student4);
	list.add(student5);
	System.out.println(list);
	//update
	Student student6 = new Student("captain",06,"america");
	list.set(4, student6);
	System.out.println(list);
	//delete
	System.out.println(list.remove(student1));
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	//seach
	System.out.println(list.get(1));
	System.out.println(list.indexOf(student6));
	for (Student student : list) {
		System.out.println(student);
	}
	System.out.println("iterator");
	Iterator<Student> iterator = list.iterator();
	while (iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student);
	}
	System.out.println("list");
	ListIterator<Student> listIterator = list.listIterator();
	while (listIterator.hasNext()) {
		Student student = (Student) listIterator.next();
		System.out.println(student);
	}
}
}
