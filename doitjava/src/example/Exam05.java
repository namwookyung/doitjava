package example;

public class Exam05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {
			if(i%3 ==0) {
				sum += i;
			}
		}
		System.out.println("1���� 50������ �� �� 3�� ����� ���� " + sum + "�Դϴ�.");
	}
}
