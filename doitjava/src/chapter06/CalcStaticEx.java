package chapter06;

public class CalcStaticEx {
	public static void main(String[] args) {
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);

		CalcStatic calcs = new CalcStatic();

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("calcs.pi: " + calcs.pi);
		
		CalcStatic calcs2 = new CalcStatic();
		
		System.out.println(calcs.num1);
		System.out.println(calcs2.num1);
		
		calcs.num1 = 20;
		calcs2.num1 = 200;
		System.out.println(calcs.num1);
		System.out.println(calcs2.num1);
		
		System.out.println(calcs.num2);
		System.out.println(calcs2.num2);
		
		calcs.num2 = 30;
		System.out.println(calcs.num2);
		
		calcs2.num2 = 300;
		System.out.println(calcs2.num2);
		
		System.out.println(calcs.num2);
		
	}
}
