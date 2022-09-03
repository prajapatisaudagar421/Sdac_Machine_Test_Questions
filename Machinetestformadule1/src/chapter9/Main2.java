package chapter9;
class X{
	int  b = 50;
	void meth() {
		class Y{
			void meth1() {
				System.out.println(b);
			}
		}
		Y y = new Y();
		y.meth1();
	}
}
public class Main2 {
public static void main(String[] args) {
	X x = new X();
	x.meth();
}
}
