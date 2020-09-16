package chapter10;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		A ia = impl;
		ia.methodA();			//A는 methodA만 실행가능
		System.out.println();
		
		B ib = impl;
		ib.methodB();			//B는 methodB만 실행가능
		System.out.println();
		
		C ic = impl;
		ic.methodA();			//C는 모두 호출가능
		ic.methodB();
		ic.methodC();
	}
}
