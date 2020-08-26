package example;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if(num1 == num2) System.out.println("Same2");
		else System.out.println("Different2");
		
		System.out.println(num1 == num2 ? "Same3" : "Different3");
		
		sc.close();
	}
}
