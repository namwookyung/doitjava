package example;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���: ");
		int num = sc.nextInt();
		String str = "";
		if(num % 2 == 0) {
			str = "¦��";
			System.out.println(str);
		} else {
			str = "Ȧ��";
			System.out.println(str);
		
		sc.close();
		}
	}
}
