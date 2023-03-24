package first;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(add(10,10));
		System.out.println(sub(10,10));
		System.out.println(mul(10,10));
		System.out.println(div(10,3)); //자동 형 변환
		
	}
		//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
		//반환타입. 메소드 이름, 매개변수, 반환이 있다면 return 반환값
		static long add(long a , long b) {
			
//			long result = a+b;
//			return result;
			return a+b;
		}
		
		
		//숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
		static long sub(long a, long b) { // a,b 는 지역변수라 괄호 밖으로 나가면 사라진다.
			return a-b;
		}
		//숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
		static long mul(long a , long b) {
			return a*b;
		}
		//숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
		static float div(float a , float b) {
			return a/b;
		}
		
	

}
