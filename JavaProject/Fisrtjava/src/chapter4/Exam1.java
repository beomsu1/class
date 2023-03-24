package chapter4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 스캐너를 사용하려면 클래스를 받아와야함 (단축키 사용)

		System.out.println("숫자를 입력하세요 : ");

		int num = 0;
		// 사용자로부터 숫자를 입력받아 숫자를 판별

		num = in.nextInt();

		if (num > 0 && (num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		} else {
			System.out.println("양수가 아니거나 홀수");
		}

	}

}
