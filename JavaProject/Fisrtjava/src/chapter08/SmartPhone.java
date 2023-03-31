package chapter08;

public class SmartPhone extends Phone {

	String model;
	
	public SmartPhone(String phoneNumber , String model) { // 상위 타입의 생성자
		super(phoneNumber);
		this.model =model; // 변수 초기화
	}

	@Override
	void turnOn() {
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");

	}
	
	
	public static void main(String[] args) {
		
		Phone smartPhone = new SmartPhone("010-1234-5677" , "IOS");
		
		smartPhone.turnOn();
		smartPhone.call();
	}

}
