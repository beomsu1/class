package chapter07;

public class ClassCasting2 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0110-0220");
		Iphone iphone = new Iphone("010-0505-0707");
		
		callByPhone(androidPhone);
		callByPhone(iphone);
	}

	
	// 매개변수에 다향성을 적용 -> 추가적인 메소드 생성이 필요없어진다.
	public static void callByPhone(Phone p) {
		p.call();
	}
	
//	public static void callByPhone(AndroidPhone p) {
//		p.call();
//	}
//
//	public static void callByPhone(Iphone p) {
//		p.call();
//	}
//	
}
