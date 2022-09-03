package chapter7;
class Xyz{
	String name = "saudagar";
	int id = 1;
	@Override
	public String toString() {
		return "Xyz [name=" + name + ", id=" + id + "]";
	}
	
}
public class Main6 {
public static void main(String[] args) {
	Xyz xyz = new Xyz();
	System.out.println(xyz);
}
}
