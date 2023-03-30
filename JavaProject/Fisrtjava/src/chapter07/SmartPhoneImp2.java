package chapter07;

public class SmartPhoneImp2 extends Phone {

	String model;

	public SmartPhoneImp2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println(model + "이어팟을 이용해서 통화합니다."); // 기존에 있던 메소드를 덮어버림 
		// 상위 타입에 있는 메소드 안에 값을 변경하면 값 출력가능
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	
	
	public static void main(String[] args) {
		
		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있다.
		
		Phone p = new SmartPhoneImp2("010-0000-0000", "IOS");
		
		p.call(); // 하위 타입 인스턴스에 정의되어 있는 오버라이딩된 call() 메소드가 호출된다.
//		p.playMusic; 위에 Phone에 없는 메소드 이기에 사용불가.
		
//		SmartPhoneImp2 p2 = new SmartPhoneImp2("2", "2"); // 인스턴스 선언 해줘야 사용가능
//		p2.playMusic();
		
		SmartPhoneImp2 p2 = (SmartPhoneImp2)p; // 강제 형 변환
		p2.playMusic();
	}
}
