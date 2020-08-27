package example;

import java.util.Scanner;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line;
		do {
			System.out.println("몇 줄을 출력하시겠습니까?:");
			line = sc.nextInt();
		} while (line % 2 == 0);
		int upline = line / 2;
		int downline = line - upline;
		
		for(int i = 0; i < upline; i++) {
			for(int j = 0; j < upline; j++) {
				if(j < upline - i - 1) {
					System.out.print(" ");
				} else {
					if(j == upline - i - 1) {
						System.out.print(" *");
					} else {
						System.out.print(" ");
					}
				}
			}
			for (int j = 0; j < i; j++) {
				if(j == i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = downline - 1; i >= 0; i--) {
			for(int j = 0; j < downline; j++) {
				if(j < downline - i - 1) {
					System.out.print(" ");
				} else {
					if(j == downline - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			for (int j = 0; j < i; j++) {
				if(j == i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
