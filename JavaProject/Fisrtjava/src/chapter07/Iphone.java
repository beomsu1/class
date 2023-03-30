package chapter07;

public class Iphone extends Phone{
	
	public Iphone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void call() {
		super.call();
		System.out.println("아이폰으로 통화합니다.");
	}
	
	
}
