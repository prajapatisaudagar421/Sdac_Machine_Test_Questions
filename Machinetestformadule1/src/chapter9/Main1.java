package chapter9;

import chapter9.A.B;

class A{
	static int a = 100;
	static class B{
		static void meth() {
			System.out.println(a);
		}
		void meth1() {
			System.out.println(a);
		}
	}
}
public class Main1 {
public static void main(String[] args) {
	A.B b = new A.B();
	b.meth1();
	b.meth();
	B.meth();
}
}
