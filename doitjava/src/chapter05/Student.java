package chapter05;

public class Student {
	/* �ʵ� - ��� ���� */
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* ������ - ��ü�� ������ �� �����ϴ� ���� */
	Student(int num1, long num2) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�. ");
	}	//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
//	Student() {}	//����Ʈ ������: �����ڸ� �������� ������ �ڵ����� ����
	Student(int num1, int num2) {
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(long num1, int num2) {
		System.out.println("Student ��ü�� �����մϴ�. ");
	}
	Student(int num) {
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	Student(long num) {
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	Student() {
		System.out.println("����Ʈ �����ڷ� student ��ü�� �����մϴ�. ");
	}
	
	/* �޼ҵ�(�޼���) - ��� �Լ� */
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}