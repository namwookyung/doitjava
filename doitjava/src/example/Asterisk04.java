package example;

public class Asterisk04 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {	//鼻欽
			for (int j = 0; j < 5; j++) {	//謝難
				if (4 - i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=0; j<i; j++) {	//辦難
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 3; i >= 0; i--) {	//ж欽
			for (int j = 0; j < 5; j++) {	//謝難
				if (4 - i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}