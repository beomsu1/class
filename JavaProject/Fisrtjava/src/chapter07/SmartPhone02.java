package chapter07;

public class SmartPhone02 extends Phone {
	
	String model;
	
	// 상위 클래스에 매개변수가 있는 생성자가 있다면 상위 클래스의 멤버를 초기화 할 데이터를 받아서
	// 상위 클래스에 생성자를 호출해주어야한다.
	// 현재 클래스의 멤버를 초기화 한다.
	public SmartPhone02(String phoneNumber, String model) { // 데이터를 받아서 초기화
		super(phoneNumber);
		// 먼저 상위클래스의 생성자를 호출하고
		// 현재 클래스의 인스턴스 변수의 초기화 
		this.model = model;
	}

	void game() {
		super.call();
		System.out.println(model + "게임을 합니다.");
	}
	
	public static void main(String[] args) {
		
		SmartPhone02 sp = new SmartPhone02("010-1111-2222", "IOS");
		sp.game();
	}
}
