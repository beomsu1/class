package chapter05.phone;

public class SmartPhone {

	// 인스턴스 변수
	String color; // 초기화가 생략되어 있음.
	float size; // 초기화가 생략되어 있음.
	int volume; // 초기화가 생략되어 있음.

	// 생성자 : 초기화 메소드 . 정의할 떄는 클래스 이름으로. 인스턴스 변수의 초기화 작업
	// 초기화 작업이 없을 경우 생략 가능
	// 아래와 같은 생성자를 => 기본생성자(default contructor)
//	SmartPhone(){
//		System.out.println("인스턴스 생성");
//	}

	// 초기화를 위한 생성자 정의
	SmartPhone(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}

	SmartPhone(String color, float size) {
		
		this(color , size , 0); // this() => 다른 생성자 호출
		
//		this.color = color;
//		this.size = size;
//		this.volume = 0;
	}

	SmartPhone() {
		
		this("white" , 4.5f , 5);
		
//		color = "white";
//		size = 4.5f;
//		volume = 5;
	}

	void call() {
		System.out.println("전화 걸기");
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

}
