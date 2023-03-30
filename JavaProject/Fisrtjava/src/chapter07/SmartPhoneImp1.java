package chapter07;

public class SmartPhoneImp1 extends Phone {

	String model;

	public SmartPhoneImp1(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다."); // 기존에 있던 메소드를 덮어버림 
	}
	
	public static void main(String[] args) {
		
		SmartPhoneImp1 spi = new SmartPhoneImp1("010-2222-5555", "Google");
				
		spi.call();
	}
}
