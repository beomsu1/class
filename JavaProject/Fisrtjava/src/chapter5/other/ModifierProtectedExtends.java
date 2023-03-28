package chapter5.other;

import chapter5.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected{
									//extends 상속하다.
	// name , age, tell()
	
	public static void main(String[] args) {
		
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
	
		mpe.name = "이강인"; // 변수 선언 한 곳에 protected 키워드 사용
		mpe.age = 30;
	
		mpe.tell();
	}
}
