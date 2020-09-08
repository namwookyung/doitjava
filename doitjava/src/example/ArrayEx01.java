package example;

public class ArrayEx01 {
	public static void main(String[] args) {
		char[] cArr = new char[26];
		cArr[0] = 'a'; // 97
		cArr[1] = 'b'; // 98
		cArr[2] = 'c'; // 99

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = (char) ('a' + i);
		}

		System.out.println(cArr);
	}
}
