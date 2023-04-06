package chapter01;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요 :");
		double r = in.nextDouble();
		
		System.out.println(cal1(r));
		
		System.out.println(cal2(r));
		
		
		
		
	}
	
	static double cal1 (double r) {
		
		return 2*Math.PI*r;
				
	}
	
	static double cal2 (double r ) {
		
		return Math.PI*r*r;
	}

}
