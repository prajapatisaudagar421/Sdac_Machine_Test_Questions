package chapter12Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Emp{
	String name;
	int id;
	int salary;
	public Emp(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	

}
public class Main2 {
public static void main(String[] args) {
	LinkedList<Emp> list = new LinkedList<Emp>();
	Emp emp1 = new Emp("ironman",1,100000);
	Emp emp2 = new Emp("batman",2,100000);
	Emp emp3 = new Emp("hulk",3,120000);
	Emp emp4 = new Emp("loki",4,130000);
	Emp emp5 = new Emp("thones",5,1000000);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	list.add(emp5);
	System.out.println(list);
	//delete
	System.out.println(list.remove());
	System.out.println(list.remove(2));
	System.out.println(list);
	Emp emp6 = new Emp("tom",7,130000);
	Emp emp7 = new Emp("jerry",8,1000000);
	//update
	list.set(1, emp7);
	System.out.println(list);
	//seach
	System.out.println(list.get(2));
	System.out.println(list.indexOf(emp7));
	System.out.println("foreach");
	for (Emp emp : list) {
		System.out.println(emp);
	}
	System.out.println("iterator");
	Iterator<Emp> iterator = list.iterator();
	while (iterator.hasNext()) {
		Emp emp = (Emp) iterator.next();
		System.out.println(emp);
	}
	System.out.println("listitrator");
	ListIterator<Emp> listIterator = list.listIterator();
	while (listIterator.hasNext()) {
		Emp emp = (Emp) listIterator.next();
		System.out.println(emp);
	}
	
}
}
