package chapter3;
class Pojo{
	private String name;
	private int salary;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class Main3 {
public static void main(String[] args) {
	Pojo pojo = new Pojo();
	pojo.setName("saudagr");
	pojo.setId(1);
	pojo.setSalary(10000);
	System.out.println(pojo.getId());
	System.out.println(pojo.getSalary());
	System.out.println(pojo.getName());
}
}
