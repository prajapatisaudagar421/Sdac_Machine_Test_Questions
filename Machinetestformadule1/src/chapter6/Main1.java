package chapter6;
interface Account{
	public final int salary = 10000;
	 public void salaryWithTax(int salary);
	 public void salaryWithOutTax(int salary);
}
public class Main1 implements Account {

	@Override
	public void salaryWithTax(int salary) {
		int tax = 1000;
		System.out.println(salary-tax);
		
	}

	@Override
	public void salaryWithOutTax(int salary) {
		// TODO Auto-generated method stub
		System.out.println(salary);
		
	}
	public static void main(String[] args) {
		Main1 main1 = new Main1();
		main1.salaryWithTax(100000);
		main1.salaryWithOutTax(100000);
		System.out.println(main1.salary);
	}

}
