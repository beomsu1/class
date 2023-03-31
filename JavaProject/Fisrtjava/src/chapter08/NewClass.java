package chapter08;

public class NewClass extends AbstractClass{
	// 추상클래스를 상속하면 추상메소드를 멤버로 가지게 된다. -> 추상클래스다.
	// 해결하기 위해서 클래스 앞에 abstract를 붙여서 추상클래스가 될 것인지 오버라이딩해서 메소드를 완성할 것 인지 결정

	@Override //추상클래스의 추상메소드를 오버라이딩
	void abstractMethod() { // 내용이 없어도 중괄호 {}가 있으면 구현한 것으로 처리
		System.out.println("추상메소드를 구현했습니다.");
		

	}
	
	
}
