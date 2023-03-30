package chapter7;

public class SmartPhone2 extends Phone{

	String model;

	public SmartPhone2() {}
	
	public SmartPhone2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	void game() {
		super.call();
		System.out.println(model + "게임을 합니다.");
		
	}
	
	
	
	
}
