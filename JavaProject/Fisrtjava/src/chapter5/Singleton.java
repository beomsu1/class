package chapter5;

public class Singleton {

	// 1. 다른 클래스에서 Singleton 클래스를 이용해서 인스턴스 생성을 막는다.
	// 막는 방법은 생성자를 private를 사용해서 제한
	
	private Singleton() {	// private = 클래스 내부에서
		
	}

	// 2. 내부에서 Singleton 클래스로 인스턴스 생성
	private static Singleton s = new Singleton(); // static을 안붙이면 인스턴스 변수
	
	// 3. 내부에서 만들어진 참조값을 외부에서 사용 할 수 있도록 참조값을 반환 해주는 메소드 필요
	public static Singleton getInstance() {
		if(s==null) {
			s= new Singleton();
		}
		return s;
	}
	
	public void printData() {
		System.out.println("데이터를 출력합니다.");
	}
	
}
