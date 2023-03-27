package chapter5.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("RED",5.0f,10); // 인스턴스 생성할떄 마다 한 번만 호출
				
//		sp.color="WHITE";
//		sp.size= 4.5f;
//		sp.volume = 5;
		
		System.out.println(sp.color); // String 참조변수 초기화 -> null
		System.out.println(sp.size);  // float 초기화 -> 0.0
		System.out.println(sp.volume); // int 초기화 -> 0
		
		
	}
	
	
	
	
	
	
}
