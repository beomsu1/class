package chapter7;

public class Phone {

	String phoneNumber;
	
	public Phone() {} //기본 생성자 생성
	
	public Phone(String phoneNumber) { //변수 phoneNumber 초기화하는 생성자
		this.phoneNumber = phoneNumber;
	}

	public void call() {
		System.out.println(phoneNumber + " 전화를 겁니다.");
	}
}
