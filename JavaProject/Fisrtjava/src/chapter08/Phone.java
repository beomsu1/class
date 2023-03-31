package chapter08;

public abstract class Phone { //abstract 메소드가 있으니 abstract 클래스가 되어야함

	String phoneNumber;

	public Phone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 겁니다.");
	}
	
	abstract void turnOn();
	
	
	
	
}
