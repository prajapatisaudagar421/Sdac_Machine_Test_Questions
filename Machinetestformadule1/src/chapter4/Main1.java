package chapter4;
class S{
	String name = "saudagar";
	int id = 1;
	void meth() {
		System.out.println(name);
		System.out.println(id);
	}
	@Override
	public String toString() {
		return "S [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
	}
	
}
public class Main1 {
public static void main(String[] args) {
	S s = new S();
	s.meth();
	s = null;
	System.gc();
	
}
}
