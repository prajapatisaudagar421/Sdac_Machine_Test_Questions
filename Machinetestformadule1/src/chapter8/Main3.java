package chapter8;

import java.io.IOException;

class A{
	void meth() throws Exception{
		int a = 10/0;
	}
}
class B{
	void meth1() throws Exception{
		A a = new A();
		a.meth();
	}
}
class Test{
	void meth() throws IOException{
		throw new IOException("decive error");
	}
	void meth1() throws IOException {
		meth();
	}
	void meth2() throws IOException {
		meth1();
	}
}
public class Main3 {
public static void main(String[] args) {
	B b = new B();
	try {
		b.meth1();
	} catch (Exception e) {
		System.out.println(e);
	}
	Test test = new Test();
	try {
		test.meth2();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
