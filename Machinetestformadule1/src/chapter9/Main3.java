package chapter9;
interface P{
	void meth();
}
abstract class Q{
	abstract void meth1();
}
class R{
	void meth2() {
		
	}
}
public class Main3 {
public static void main(String[] args) {
	P p = new P() {
		@Override
		public void meth() {
			System.out.println("interface");
			
		}
	};
	p.meth();
	Q q = new Q() {
		@Override
		void meth1() {
			System.out.println("abtract class");
		}
	};
	q.meth1();
	R r = new R() {
		@Override
		void meth2() {
			System.out.println("simple class");
		}
	};
	r.meth2();
}
}
