package example;

public class PingPong {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "PingPong");
			System.out.println(i + "Ping");
			} else if(i % 5 == 0) {
			System.out.println(i + "Pong");
			} else {
				System.out.println(i);
			}
		}
	}
}
