package chapter8;

class MyExpection extends Exception {
	public MyExpection() {
		System.out.println("error");
	}
}

class Imp extends MyExpection {
	boolean flag = false;
	void meth() throws Exception {
		if(flag) {
			System.out.println("seccessfull");
		}else {
			throw new MyExpection();
		}
	}
}

public class Main4 {
public static void main(String[] args) {
	Imp imp = new Imp();
	try {
		imp.meth();
	} catch (Exception e) {
		// TODO: handle exception
		//System.out.println(e);
	}
	try {
		throw new MyExpection();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("caught");
		System.out.println(e);
	}
}
}
