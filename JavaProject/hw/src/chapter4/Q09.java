package chapter4;

public class Q09 {

	public static void main(String[] args) {

		int num;
		int result = 1; // 곱셉이라 0 이 아니라 1로 지정

		for (num = 1; num <= 10; num++) {

			result = result * num;
			// System.out.println(result);
		}

		System.out.println("1부터 10까지의 곱한 값 : " + result);

	}

}
