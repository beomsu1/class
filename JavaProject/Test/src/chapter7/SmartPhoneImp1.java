package chapter7;

public class SmartPhoneImp1 extends Phone {

	String model; // 변수 생성

	public SmartPhoneImp1(String phoneNumber, String model) { // 폰 넘버와 모델을 초기화하는 생성자
		super(phoneNumber); // 상위 생성자 호출
		this.model = model; // 모델 초기화
	}

	@Override
	public void call() { //메소드를 재구성
		super.call(); //super을 사용하여 상위메소드 call을 불러옴
		System.out.println("이어폰을 이용하여 통화를 합니다.");
	}

	public static void main(String[] args) {

		SmartPhoneImp1 spi = new SmartPhoneImp1("010-1234-5678", "IOS");

		spi.call();

	}
}