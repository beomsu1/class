package chapter08.phone;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println(Phone.PHONE_NUM_1); // static을 사용했기에 인스턴스를 안 만들어도 참조가능
		
//		Phone phone = null; // = new 구현한클래스();
//		// 1. 전원을 킨다
//		phone.turnOn();
//		// 2. 통화
//		phone.call();
//		// 3. 전원을 끈다.
//		phone.turnOn();
		
		
		SmartPhone2 phone2 = new SmartPhone2();
		/////////////////
		// 1. 전원을 키고
		phone2.turnOn();
		// 2. 전화를 걸고
		phone2.call();
		// 3. 게임을 한다			//Phone phone2 = new SmartPhone2(); 라고 했을시
		phone2.gamePlay();		//((SmartPhone)phone2).gamePlay();
		// 4. 전원을 끈다
		phone2.turnOff();
		
	}

}
