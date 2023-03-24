package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
	
		System.out.println("첫번쨰 숫자를 입력하세요.");
		long num1 = in.nextLong();
	
		System.out.println("두번쨰 숫자를 입력하세요.");
		long num2 = in.nextLong();
		
		System.out.println("연산의 결과 ==========");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		System.out.println();
		
		System.out.println("반지름을 입력하세요.");
		double r = in.nextDouble(); //실수 들어와야 하니  double
		
		System.out.println("원의 둘레는 : " + cal1(r));
		System.out.println("원의 넓이는 : " + cal2(r));
		
		
	} // 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	// 반환타입. 메소드 이름, 매개변수, 반환이 있다면 return 반환값

	// 변경 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add(long a, long b) {
		System.out.println(a + "+" + b + "=" + (a + b));

	}

	// 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	static void sub(long a, long b) { // a,b 는 지역변수라 괄호 밖으로 나가면 사라진다.
		System.out.println(a + "-" + b + "=" + (a - b));
	}

	// 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	static void mul(long a, long b) {
		System.out.println(a + "*" + b + "=" + (a * b));
	}

	// 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	static void div(float a, float b) {
		System.out.println(a + "/" + b + "=" + (a / b));
	}

	static double cal1(double r) {
		// 2 x Math.PI x r
		return 2 * Math.PI * r;
	}

	static double cal2(double r) {
		// π x r x r
		return Math.PI * r * r;

	}

}
