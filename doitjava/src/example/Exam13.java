package example;

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력하시겠습니까?:");
		int line = sc.nextInt();
		int upline = line / 2;
		int downline = line - upline;
		
		for(int i=0; i<upline; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=downline-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
