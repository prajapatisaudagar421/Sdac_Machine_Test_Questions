package chapter9;
class Outer{
	int a= 10;
	class Inner{
		void meth() {
			System.out.println(a);
		}
	}
}
public class Main {
public static void main(String[] args) {
	Outer outer = new Outer();
	Outer.Inner inner = outer.new Inner();
	inner.meth();
}
}
