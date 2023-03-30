package chapter7;

public class SmartPhoneImp2 extends Phone{

	String model;

	public SmartPhoneImp2(String phoneNumber , String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	public void call() {
		super.call();
		System.out.println("이어팟을 이용하여 통화를 합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 틉니다.");
	}

	public static void main(String[] args) {
		
		Phone phone = new SmartPhoneImp2("010-1234-5678", "Google");
		
		phone.call();
		
		// phone.playMusic(); Phone 상위 클래스에는 없는 메소드이기에 사용불가.
	}
	
	
}
