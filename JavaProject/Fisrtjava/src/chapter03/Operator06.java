package chapter03;

public class Operator06 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 2;
		float num3 = 7.0f;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 / 7 ); // int형이라 정수만 표기 가능
		System.out.println(num1 / num3); // float형이라 소수점7짜리 까지만
		System.out.println(num1 % num2);
		System.out.println(num1 % 7);
		
	}

}