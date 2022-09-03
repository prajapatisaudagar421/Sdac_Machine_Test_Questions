package chapter12Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Emp1 implements Comparable{
	String name;
	int id; 
	int age;
	public Emp1(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		int age = Integer.MIN_VALUE;
		Emp1 e = (Emp1) o;
		
		if(age == e.age) {
			return 0;
		}else if(age>e.age) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class Main {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	Emp1 emp1 = new Emp1("saudagar",1,24);
	Emp1 emp2 = new Emp1("tom",2,21);
	Emp1 emp3 = new Emp1("mohan",3,20);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	Iterator iterator = list.iterator();
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	System.out.println("sorted by age");
	Collections.sort(list);
	Iterator iterator2 = list.iterator();
	while (iterator2.hasNext()) {
		Object object = (Object) iterator2.next();
		System.out.println(object);
	}
	
	
}
}
