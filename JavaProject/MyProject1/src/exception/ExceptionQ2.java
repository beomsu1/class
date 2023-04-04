package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQ2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("태어난 년도를 입력해주세요.");

		try {
			int year = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}

	}

}
