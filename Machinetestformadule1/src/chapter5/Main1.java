package chapter5;
class P{
	P meth() {
		System.out.println("inside P");
		return this;
	}
	public void messege() {
		System.out.println("P methods");
	}
}
class Q extends P{
	@Override
	Q meth() {
		System.out.println("inside Q");
		return this;
	}
	public void messege() {
		System.out.println("Q methods");
	}
	
}
public class Main1 {
public static void main(String[] args) {
	new P().meth().messege();
	new Q().meth().messege();
}
}
