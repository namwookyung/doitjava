package chapter10;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		A ia = impl;
		ia.methodA();			//A�� methodA�� ���డ��
		System.out.println();
		
		B ib = impl;
		ib.methodB();			//B�� methodB�� ���డ��
		System.out.println();
		
		C ic = impl;
		ic.methodA();			//C�� ��� ȣ�Ⱑ��
		ic.methodB();
		ic.methodC();
	}
}
