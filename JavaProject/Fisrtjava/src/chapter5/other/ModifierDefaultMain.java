package chapter5.other;

import chapter5.ModifierDefault;

public class ModifierDefaultMain {

	public static void main(String[] args) {
		
		ModifierDefault md = new ModifierDefault();
		
		md.name = "김민재"; // default 값이라 참조가능 //다른 패키지에서는 참조 불가
		md.age = 20;
		
		md.tell();
		
		// 선언 한 곳에 public을 사용해주면 참조가능
	}

}
