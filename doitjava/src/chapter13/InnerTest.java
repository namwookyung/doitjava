package chapter13;

class OutClass { // �ܺ� Ŭ����
	private int num = 10; // �ܺ� Ŭ���� private ����
	private static int sNum = 20; // �ܺ� Ŭ���� ���� ����

	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {

			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}

		static void sTest() {

			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}

	class InClass { // �ν��Ͻ� ���� Ŭ����
		int inNum = 100; // ���� Ŭ������ �ν��Ͻ� ����
//		static int sInNum = 200;

		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
			System.out.println();
		}

		// static void sTest() {
		// }
	}

	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();
	}

}
