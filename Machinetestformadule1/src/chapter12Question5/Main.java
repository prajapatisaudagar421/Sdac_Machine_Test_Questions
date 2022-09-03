package chapter12Question5;

import java.util.HashMap;
import java.util.Map;

class Stundent{
	String name;
	int id;
	int age;
	public Stundent(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stundent [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
}
public class Main {
public static void main(String[] args) {
	Stundent stundent1 = new Stundent("saudagar",1,21);
	Stundent stundent2 = new Stundent("siddhant",2,22);
	Stundent stundent3 = new Stundent("athul",3,23);
	Stundent stundent4 = new Stundent("anish",4,21);
	Stundent stundent5 = new Stundent("Pranoy",4,26);
	Map<Integer, Stundent> map = new HashMap<Integer, Stundent>();
	map.put(1, stundent5);
	map.put(2, stundent4);
	map.put(3, stundent3);
	map.put(4, stundent2);
	map.put(5, stundent1);
	System.out.println(map);
	//deltele
	map.remove(1);
	System.out.println(map);
	//update 
	Stundent stundent6 = new Stundent("deepesh",5,30);
	map.replace(2, stundent6);
	System.out.println(map);
	//seach
	System.out.println(map.get(3));
	
}
}
