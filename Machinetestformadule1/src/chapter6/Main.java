package chapter6;
abstract class Salary{
	int salary = 12000;
	abstract void salary();
}
public class Main extends Salary{

	@Override
	void salary() {
		System.out.println("salary is"+10000);
		
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.salary();
		System.out.println(main.salary);
	}

}
