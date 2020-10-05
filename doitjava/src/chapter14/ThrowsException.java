package chapter14;

public class ThrowsException {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		System.out.println("프로그램을 종료");
		try {
			throw new ArithmeticException("허허허");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
