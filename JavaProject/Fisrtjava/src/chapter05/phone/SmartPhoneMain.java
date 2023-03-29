package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone("RED",5.0f,10); // 인스턴스 생성할떄 마다 한 번만 호출
		SmartPhone sp2 = new SmartPhone("GOLD", 4.0f);
		SmartPhone sp3 = new SmartPhone();
		// new SmartPhone 힙 영역에 생성
		// SmartPhone("RED",5.0f,10)
		
		
//		sp.color="WHITE";
//		sp.size= 4.5f;
//		sp.volume = 5;
		
		System.out.println(sp1.color); // String 참조변수 초기화 -> null
		System.out.println(sp1.size);  // float 초기화 -> 0.0
		System.out.println(sp1.volume); // int 초기화 -> 0
		
		System.out.println();
		
		System.out.println(sp2.color); // String 참조변수 초기화 -> null
		System.out.println(sp2.size);  // float 초기화 -> 0.0
		System.out.println(sp2.volume); // int 초기화 -> 0
		
		System.out.println();
		
		System.out.println(sp3.color); // String 참조변수 초기화 -> null
		System.out.println(sp3.size);  // float 초기화 -> 0.0
		System.out.println(sp3.volume); // int 초기화 -> 0
		
		Member member = new Member("KING" , "king@gmail.com" , 20 , "010-0000-0000" , sp2);
		
		printInfo(member);
		
	}
	
	static void printInfo(Member member) {
		member.showData();
	}
	
	
	
	
}
