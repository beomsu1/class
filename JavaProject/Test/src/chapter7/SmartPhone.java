package chapter7;

public class SmartPhone extends Phone{
	
	String model;
	
	public void game() {
		System.out.println(model + "게임을 합니다.");
	

	}

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.phoneNumber = "010-1111-2222";
		sp.model = "Google";
		
		sp.call();
		sp.game();
	}
	

}
