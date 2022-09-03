package chapter5;
class A{
	void meth() {
		System.out.println("meth 1");
	}
	 final void meth1() {
		System.out.println("meth 2");
		// we can't override the final methods
	}
}
class B extends A{
	@Override
	void meth() {
		System.out.println("override meth 1");
	}
	
}
public class Main {
public static void main(String[] args) {
	int a = 10;
	a = 15;
	System.out.println(a);
	final int  b = 20;
	//b = 25;//we can't change the value of final variables
	System.out.println();
	B b1 = new B();
	b1.meth1();
	b1.meth();
	
	
}
}
