package chapter04;

public class Exam9 {

	public static void main(String[] args) {
		
		// 곱하기 일떄는 int = 0 사용 X
		// 1부터 10끼지의 곱
		
		int result =1 ;
		
		for(int i=1;i<=10; i++) {
//			System.out.println(i);
			
			result = result * i; // result *= i;
		}
		
		System.out.println("1~10 까지 숫자들을 곱한 결과 : " + result);
		
	}

}
