package chapter03;

public class Operator11 {

	public static void main(String[] args) {
		
		
		char c = 'A';
		int num = 10;
		
		System.out.println(c > 10); // char > int -> int > int 으로 자동 형 변환
		System.out.println('1' > '0'); // char > char -> int > int 으로 자동 형 변환
		System.out.println(num == 10f); // int = float -> float > float으로 자동 형 변환
		
		
	}

}
