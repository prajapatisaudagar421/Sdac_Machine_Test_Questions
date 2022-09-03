package chapter9;
class J{
	void meth() {
		System.out.println("method one");
	}
}
class Y{
	void meth1(J x) {
		x.meth();
		System.out.println("method two");
	}
}
public class Main4 {
public static void main(String[] args) {
	Y y = new Y();
	y.meth1(new J());
}
}
