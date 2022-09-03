package chapter7;

import java.util.Objects;

class Emp{
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
}
public class Main4 {
public static void main(String[] args) {
	Emp emp = new Emp("saudagar",1);
	Emp emp1 = new Emp("saudagar",2);
	System.out.println(emp.equals(emp1));
}
}
