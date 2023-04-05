package chapter08;

import java.util.Scanner;

public class Main extends Inheritance{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 : ");
		long num1 = sc.nextLong();
		
		System.out.println("두번째 숫자 : ");
		long num2 = sc.nextLong();
		
		sc.close();
		
		Inheritance i = new Inheritance();
		System.out.println(i.add(num1, num2));
		System.out.println(i.substract(num1, num2));
		System.out.println(i.multiply(num1, num2));
		System.out.println(i.divide(num1, num2));
	}
	
	
}
