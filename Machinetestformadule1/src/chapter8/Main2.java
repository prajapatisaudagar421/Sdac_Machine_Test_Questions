package chapter8;

public class Main2 {
public static void main(String[] args) {
	try {
		int a = 10/0;
	}catch (Exception e) {
		System.out.println(e);
	}finally {
		System.out.println("welcome to my code");
	}
}
}
