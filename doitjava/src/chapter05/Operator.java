package chapter05;

public class Operator {
	int add(int n, int m) {	//�Ű������� �̸��� ���ϴ´�� ������ �� �ֽ��ϴ�.
		return n + m;
	}
	
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int o, int p) {
		if(o == 0) {
			System.out.println("0���� ���� ���� �����ϴ�.");
			return 0;
		}
		return o / p;
	}
	
	void printStar() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
