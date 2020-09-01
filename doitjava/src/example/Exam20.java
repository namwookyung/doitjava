package example;

import java.util.Scanner;

public class Exam20 {
	public static void main(String[] args) {
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;

		int user, com;
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임입니다.");
		while (true) {
			com = (int) (Math.random() * 3);
			System.out.println("0: 가위, 1: 바위, 2: 보");
			System.out.print("> ");
			user = sc.nextInt(); // 0, 1, 2 이외의 입력을 재입력할 수 있도록 합니다.

			/* 결과값 출력 */
			System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.println("유저 : " + (user == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println("비김");
				score += 10;
			} else {
				System.out.println("컴퓨터 승");
				life--;
			}

			/* 현재 점수와 남은 목숨 출력 */
			System.out.println("현재 " + score + "점, 남은 목숨 " + life + "개 입니다.");

			/* 목숨이 0이 되면 게임을 종료 */
			if (life == 0) {
				System.out.println();
				System.out.println("게임을 종료합니다.");
				sc.close();
				break;
			}
		}
	}
}
