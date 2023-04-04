package exception;

import java.util.Scanner;

public class ExceptionQ1 {

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