package chapter10;

import java.util.Scanner;

public class Exam1 {

	// 콘솔에서 사용자 아이디를 입력 받아
	// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();

		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);

			try {

				if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
					BadIdInputException e = new BadIdInputException("아이디는 영문자와 숫자만 입력해주세요.");
					throw e;
				}
			} catch (BadIdInputException e) {
				System.out.println(e.getMessage());
				break;
			}

		}
	}
}
