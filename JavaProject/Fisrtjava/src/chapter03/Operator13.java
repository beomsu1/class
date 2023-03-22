package chapter03;

public class Operator13 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		boolean result = false; // 메소드 안에서 변수는 초기화
		
		result = (num1 += 10) < 0 && (num2 += 10 ) > 0 ; // num1 += 10 => num1 = num1+10
		// (num1 += 10)이 false라 뒤에 부분 (num2 += 10)은 실행하지 않음.
		
		System.out.println(result);
		System.out.println("num1 =" + num1 +  " , num2 = " + num2);
		
		
		result = (num1 += 10 ) > 0 || (num2 += 10 ) > 0 ;
		
		System.out.println(result);
		System.out.println("num1 =" + num1 +  " , num2 = " + num2);
		// (num1 += 10)이 true라 뒤에 부분 (num2 += 10)은 실행하지 않음.
		
	}

}
