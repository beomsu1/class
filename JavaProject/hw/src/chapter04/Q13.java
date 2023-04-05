package chapter04;

public class Q13 {

	public static void main(String[] args) {
		// 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
		// 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

		int num;
		int num1;

		for (num = 2; num < 9; num *= 2) {

			for (num1 = 1; num1 < num; num1++) {
				System.out.println(num + " X " +num1 + " = " + num*num1);
			}

		}
	}
}
