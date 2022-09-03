package chapter12Question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Emp {
	String name;
	int id;
	int age;

	public Emp(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}

class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e = (Emp) o1;
		Emp e1 = (Emp) o2;
		return e.name.compareTo(e1.name);
	}

}

class IdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e = (Emp) o1;
		Emp e1 = (Emp) o2;
		if (e.id == e1.id) {
			return 0;
		} else if (e.id > e1.id) {
			return 1;
		} else {
			return -1;
		}

	}

}

class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e = (Emp) o1;
		Emp e1 = (Emp) o2;
		if (e.age == e1.age) {
			return 0;
		} else if (e.age > e1.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Main1 {
	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		Emp emp = new Emp("saudagar", 3, 20);
		Emp emp1 = new Emp("rohit", 2, 22);
		Emp emp2 = new Emp("raj", 1, 24);
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("sorted by name");
		Collections.sort(list, new NameComparator());
		Iterator iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			Object object = (Object) iterator2.next();
			System.out.println(object);
		}
		System.out.println("sorted by id");
		Collections.sort(list,new IdComparator());
		Iterator iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			Object object = (Object) iterator3.next();
			System.out.println(object);
		}
		System.out.println("sorted by age");
		Collections.sort(list,new AgeComparator());
		Iterator iterator4 = list.iterator();
		while (iterator4.hasNext()) {
			Object object = (Object) iterator4.next();
			System.out.println(object);
		}
	}
}
