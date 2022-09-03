package chapter5;
class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	@Override
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	@Override
	float getRateOfInterest() {
		return 5.5f;
	}
}
class AXIS extends Bank{
	@Override
	float getRateOfInterest() {
		return 6.8f;
	}
}
public class Main2 {
public static void main(String[] args) {
	Bank b;
	b = new SBI();
	System.out.println("SBI rate of interest"+b.getRateOfInterest());
	b = new ICICI();
	System.out.println("ICICI rate of interest"+b.getRateOfInterest());
	b = new AXIS();
	System.out.println("AXIS rate of intereset"+b.getRateOfInterest());
}
}
