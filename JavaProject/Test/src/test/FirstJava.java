package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FirstJava {

/*
 * 어떤 파일
 * 어떤 목적
 * 누가 작성
 * 언제 수정
 * 
 * 
 * 	
 */
	
	public static void main(String[] args) {
		// 주석은 컴파일 시 인식 
		
		// 변수들 정의
		// 함수 (메소드)들 정의
		
		// 메인메소드 -> 클래스 실행시 시작 시점
		
		//System.out.println("First Java1");
		/* System.out.println("First Java2"); 
		System.out.println("First Java3");*/
		/* System.out.println("First Java4"); */

		// 변수 : 메모리 공간 할당
		// 선언방법
		// 자료형타입 변수이름;
		
		//나이를 저장하는 변수를 선언
		int age; // 변수선언 : 나이 값을 저장할 수 있는 변수 선언
		age=20; //변수의 초기화
		
		//원주율 : pi -> 3.141592... <- 실수
		double pi;
		pi=3.141592;
		
		System.out.println(age);
		System.out.println(pi);
		
		int resultValue = add(10,20);
		System.out.println(resultValue);
		
		hello();

		hello2("손흥민");
	}

	
	// 정수 두개를 받아 -> 매개변수 선언
	// 더하기 연산한 -> 내부 처리 
	// 결과를 반환하는 메소드 -> return 결과값;
	
	static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		
		// 결과값을 반환
		return result;
		}
	
	// 기능 : 인사말을 출력하는 기능을 가지는 메소드
	// 매개변수 : 데이터를 받는 정의 -> 데이터 필요 없다!
	// 결과반환 : 반환이 필요 없음
	// 반환타입 메소드이름(매개변수){}
	// void : 반환 값이 없을때 사용 - return이 없다.
	
	static void hello() {
		System.out.println("안녕하세요!");
		System.out.println("반갑습니다.");
	}
	
	// 이름을 전달받아 이름과 인사말을 출력하는 메소드
	// 매개변수 : 이름 ( 문자열 )
	// 반환 : 없음

	static void hello2(String name) {
		
		System.out.println(name);
		System.out.println("안녕하세요");
	}
}
	
	
	
		
	

