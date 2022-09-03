package chapter5;
class Salary{
	void salary(int sal, int tax) {
		System.out.println(sal+tax);
	}
	void salary(int sal) {
		System.out.println(sal);
	}
}
class Account extends Salary{
	@Override
	void salary(int sal, int tax) {
		System.out.println(sal-tax);
	}
}
public class Main3 {
public static void main(String[] args) {
	Salary salary = new Salary();
	salary.salary(10000);
	salary.salary(10000, 2000);
	Account account = new Account();
	account.salary(10000, 2000);
}
}
