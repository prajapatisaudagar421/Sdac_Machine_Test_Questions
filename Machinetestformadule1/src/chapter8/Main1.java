package chapter8;

public class Main1 {
public static void main(String[] args) {
	try {
		int[] arr = new int[3];
		arr[4] = 10;
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}catch (Exception e) {
		System.out.println(e);
	}
}
}
