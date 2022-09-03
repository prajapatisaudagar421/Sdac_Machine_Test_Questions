package chapter7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company{
	String name;
	int id;
	int salary;
	public Company(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
public class Main7 {
public static void main(String[] args) {
	Company company = new Company("saudagar",1,20002);
//	System.out.println(company.getClass());
//	System.out.println(company.getClass().getConstructors());
	Constructor constructor[] = company.getClass().getConstructors();
	for (int i = 0; i < constructor.length; i++) {
		System.out.println(constructor[i]);
		
	}
	Method method[] = company.getClass().getMethods();
	for (int i = 0; i < method.length; i++) {
		System.out.println(method[i]);
		
	}
	Field field[] = company.getClass().getFields();
	for (int i = 0; i < field.length; i++) {
		System.out.println(field[i]);
		
	}
}
}
