package chapter7;
class A{
	void meth() {
		System.out.println("meth one");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("called");
	}
}
public class Main5 {
public static void main(String[] args) {
	A a = new A();
	//a.meth();
	a = null;
	System.gc();
}
}
