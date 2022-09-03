package chapter6;
interface Operation{
	void insertData();
	void updateData();
	void showData();
	void deleteData();
}
class Implementor implements Operation{

	@Override
	public void insertData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		
	}
	
}
class Devloper1 extends Implementor{
	@Override
	public void insertData() {
		System.out.println("insert logic will be written by developer 1");
	}
	@Override
	public void updateData() {
		System.out.println("Update logic will be written by developer 1");
	}
}
class Devloper2 extends Implementor{
	@Override
	public void showData() {
		System.out.println("show logic will be written by developer 2");
	}
	@Override
	public void deleteData() {
		System.out.println("delete logic will be written by developer 2");
	}
}
public class Main2 {
public static void main(String[] args) {
	Devloper1 devloper1 = new Devloper1();
	devloper1.insertData();
	devloper1.updateData();
	Devloper2 devloper2 = new Devloper2();
	devloper2.showData();
	devloper2.deleteData();
}
}
