package chapter5;
class Frist{
	public Frist() {
		this(100);
		System.out.println("defualt");
	}

	public Frist(int i) {
		this(100,200);
		System.out.println(i);
	}

	public Frist(int i, int j) {
		System.out.println(i+j);
	}

	
	
}
class Second extends Frist{

	public Second() {
		super();
	}
	
	
}
public class Main4 {
public static void main(String[] args) {
	new Second();
}
}
