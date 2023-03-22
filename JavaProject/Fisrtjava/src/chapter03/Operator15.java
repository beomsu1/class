package chapter03;

public class Operator15 {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 5;
		
		int min = (num1<num2) ? num1 : num2;
					//참 일때		참 		거짓
		System.out.println("작은 수 : " + min);
		
		int max = (num1>num2) ? num1 : num2;
					//거짓일때		참		거짓
		System.out.println("큰 수 : " + max);
		
		String result = num1 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result의 값은 " + result + "입니다.");
		
		String result2 = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result2의 값은 " + result2 + "입니다.");
		
		
	}

}
